package demo.social.com.user; 

import org.springframework.stereotype.Service;

@Service
public class UserService {
	UserRepository userRepository;
	
	// Constructor injection 
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	public User save(User user) {
		return userRepository.save(user); 
	}
}
