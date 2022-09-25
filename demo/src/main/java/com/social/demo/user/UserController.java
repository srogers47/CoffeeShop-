package demo.social.com.user;

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController // implies ResponseBody and Controller annototations (combo) but is cannot associate with an interceptor 
@RequestMapping("/api/1.0/users")
public class UserController{
	
	@Autowired
	UserService userService;

	@PostMapping("/api/1.0/users") 
	void createUser(@RequestBody User user) {
		userService.save(user); 
	}
}
