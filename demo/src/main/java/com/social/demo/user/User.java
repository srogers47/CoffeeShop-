package demo.social.com.user; 


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data; 

@Data
@Entity // Annontation hibernate will make a table using this class 
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // Do I need to specify that this is Auto? 
	private long id;
	private String username;
	private String displayName; 
	private String password;
}
