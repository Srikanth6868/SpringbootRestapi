package xv.training.SpringbootRestapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import xv.training.SpringbootRestapi.entities.Student;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long>{
	//find by name created in crud repository interface
	List<Student>findByName(@Param("name") String name); //pathvariable is for creating url with /,in param we shud give methodname?name=name
	
	//findByAge created in crud repository interface
	List<Student>findByAge(int age);
	
	//findByQualification created in crud repository interface

	List<Student> findByQualification(String qualification);
	
	//findByNameAndQualification created in crud repository interface
	List<Student> findByNameAndQualification(String name, String qualification);
	
	//findByNameAndAge created in crud repository interface
	List<Student> findByNameAndAge(String name, int age);
	
	@Query("select s from Student s where s.name = ?1")
	List<Student> findbyname1(String name);//creating our own query without using crud repository interface methods

}
