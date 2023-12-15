package RestAPISpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {
	
	@Autowired
	StudentInterface SD;
	
	@RequestMapping("/savedata")
	public String DataInSert()
	{

		StudentData d1 = new StudentData();
		d1.setId(100);
		d1.setName("Punam");
		
		StudentData d2 = new StudentData();
		d2.setId(101);
		d2.setName("Chotya");
		
		List<StudentData>s1=new ArrayList<>();
		s1.add(d1);
		s1.add(d2);
		
		
		SD.saveAll(s1);
		
		return "data Inserted";
	}
	@RequestMapping("/GetData")
	public List<StudentData> GetData()
	{
		Iterable<StudentData>data = SD.findAll();
		List<StudentData>ldata = new ArrayList<>();
		data.forEach(x->ldata.add(x));
		return ldata;
	}
	
	@RequestMapping(path = "/InsertByService", method = RequestMethod.POST)
	public String dataSaveByService(@RequestBody StudentData st)
	{
		SD.save(st);
		return "Data added by service";
	}
	
	
	

}
