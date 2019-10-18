package xv.training.SpringbootRestapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xv.training.SpringbootRestapi.entities.Organization;
import xv.training.SpringbootRestapi.entities.Student;
import xv.training.SpringbootRestapi.repositories.OrganizaitonRepository;
import xv.training.SpringbootRestapi.repositories.StudentRepository;



@SpringBootApplication
public class SpringbootRestapiApplication {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private OrganizaitonRepository organizationRepository; //why we r using logger??
	private static final Logger logger = LoggerFactory.getLogger(SpringbootRestapiApplication.class);//what is the use of logger here??
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestapiApplication.class, args);
		System.out.println("hello spring!!!");
	}
	
	@Bean
	CommandLineRunner runner() {
	return args -> {
		//id is auto generated even if we give the id it wont take.so i removed it from the organization constructor
		Organization organization1 = new Organization( "JNTUH", "Top University in hyderabad");
		Organization organization2 = new Organization( "Delhi University", "Top University in delhi");
		Organization organization3 = new Organization( "IIT Madras", "Top University in Madras");
		Organization organization4 = new Organization( "ISB bangalore", "Top University in bangalore");

		
		organizationRepository.save(organization1);
		organizationRepository.save(organization2);
		organizationRepository.save(organization3);
		organizationRepository.save(organization4);
		
		studentRepository.save(new Student("Srinivas", "Male", "BE", 25, organization1));
		studentRepository.save(new Student("Nesha", "Female", "BE", 20, organization3));
		studentRepository.save(new Student("Seema", "Female", "BTech", 30, organization2));
		studentRepository.save(new Student("Suraj", "Male", "Electrical Engineer", 35, organization2));
		studentRepository.save(new Student("Sairam", "Male", "BE", 21,organization4));
		studentRepository.save(new Student("Sushma", "Female", "BE", 20, organization1));
		studentRepository.save(new Student("Sahithi", "Female", "BTech", 22,organization3));
		studentRepository.save(new Student("Ganesh", "Male", "MCA", 25, null));
		
	};
	}

}
