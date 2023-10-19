package nca.java2.secure;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accounts")
public class AccountsEntity {

	@Id
	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;
	
	@Column(name="enabled")
	private Boolean enabled;
	
	@Column(name="expiration")
	private Date expiration;
	
	@Column(name="password_expiration")
	private Date passwordExpiration;
	
	@Column(name="login_failure_count")
	private Integer loginFailureCount;

}
