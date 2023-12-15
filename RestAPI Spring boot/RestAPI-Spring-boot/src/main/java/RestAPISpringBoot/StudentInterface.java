package RestAPISpringBoot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInterface extends CrudRepository<StudentData, Long>  {

}
