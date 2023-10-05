package nca;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

	@Column(name="name")
	private String name;
	@Column(name="kana")
	private String kana;
	
	@Column(name="birthday")
	private String birthday; //yyyy-mm-dd
	@Column(name="gender")
	private String gender; // M | F | U
	
	@Column(name="bloodtype")
	private String bloodtype; // A | O | B | AB
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="tel")
	private String tel;
	@Column(name="zip")
	private String zip;
	
	@Column(name="address")
	private String address;
	@Column(name="password")
	private String password;
}
