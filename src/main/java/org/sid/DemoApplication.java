package org.sid;


import org.sid.dao.sprintsRepository;
import org.sid.dao.todoRepository;
import org.sid.entities.Sprints;
import org.sid.entities.Userstories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
private todoRepository t;
	@Autowired
private sprintsRepository a;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public void run(String ...args0)throws Exception{
	

t.findAll().forEach(c->{
System.out.println(c.getUserstory());
});
	}


}
