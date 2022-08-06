package demo.social.com; 

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import demo.social.com.user.User; // User class being tested 

// Naming Convertion used for tests --> methodName_condition_expectedBehavior 

@RunWith(SpringRunner.class) 
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // TODO Need to get the random port and pass as arg in docker --> Otherwise proxy won't pass info between frontend backend
@ActiveProfiles("test") 
@FixedMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserControllerTest {
	// endpoint 
	// Rest encourages the use of plural naming, api, and version
	private static final String API_1_0_USERS = "/api/1.0/users"; 

	@AutoWired 
	TestRestTemplate testRestTemplate; 

	@AutoWired
	UserRepository userRepository

	@Before // Before each test is run 
	public void cleanup() {
		userRepository.deleteAll(); // Remove test-users from db --> user test  below is checking if user count = 1 
	}

	@Test
	public void postUser_WhenUserIsValid_recieveOk() {
		User user = createValidUser();

		ResponseEntity<Object> response = testRestTemplate.postForEntity(API_1_0_USERS, user, Object.class); // Pass user response url

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK); // Get a 200 status code 
	}

	@Test
	public void postUser_whenUserIsValid_userSavedToDatabse(){
		User user = createValidUser();
		testRestTemplate.postForEntity(API_1_0_USERS, user, Object.class); 
		assertThat(userRepository.count()).isEqualTo(1); 
	}

	private User createValidUser() {
		User user = new User(); 
		user.setUsername("test-user"); 
		user.setDisplayName("test-display"); 
		user.setPassword("P4ssword"); 
		return user
	}
}
