package com.example.demo;

import com.example.demo.model.UserData;
import com.example.demo.repository.UserDataRepository;
import com.example.demo.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	public UserServiceInterface userService;

	@Autowired
	private UserDataRepository userDataRepository;

	private static final String defaultValue = "database username in url like database?username=example";

	public DemoApplication(UserDataRepository userDataRepository) {
		this.userDataRepository = userDataRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/database")
	public String database(@RequestParam(value = "username", defaultValue = defaultValue) String username){
		if(username.equals(defaultValue)){
			return String.format("Please provide %s",username);
		} else{
			return String.format(" Database username: %s ", username);
		}
	}

	@GetMapping("/usersList")
	public List<UserData> listUsers(Model model){
		List<UserData> userData = (List<UserData>) userService.findAll();
		model.addAttribute("users", userData);

		return userData;
	}

	@PostMapping("/addUser")
	public UserData newUser(@RequestBody UserData newUser){
		System.out.println("Added a new entry");
		return userDataRepository.save(newUser);
	}

	@PostMapping("/addUserData")
	public String create(@RequestParam String name, String companyName, String city) {
		UserData userData = new UserData();

		userData.setName(name);
		userData.setCity(city);
		userData.setCompanyName(companyName);
		userDataRepository.save(userData);
		return userData.toString();
	}
}
