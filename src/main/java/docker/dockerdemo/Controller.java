package docker.dockerdemo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	@GetMapping("/data")
	public List<Employee> getData()
	{
		
		 Employee e=new Employee();
		 e.setAge(28);
		 e.setName("preet");
		  employeeRepo.save(e);
		return employeeRepo.findAll();
	}
	
	@GetMapping("/emp")
	public List<Employee> getEmpData()
	{
		return employeeRepo.findAll();
	}

}
