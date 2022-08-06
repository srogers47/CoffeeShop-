package demo.social.com.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired; 

@RestController
@RequestMapping("/api/1.0/users")
public class UserController{
	
	@Autowired
	UserService userService;


	@PostMapping("/api/1.0/users") 
	void createUser(@RequestBody User user) {
		userService.save(user); 
	}
}
