package WebServicesRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	@GetMapping("/GoodEvening")
	public String good()
	{
		return "Good Morning";
	}

}
