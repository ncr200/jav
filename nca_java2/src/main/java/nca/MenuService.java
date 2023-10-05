package nca;

import org.springframework.stereotype.Service;

//@Transactional
@Service
public class MenuService {

	
	

	public boolean isAuth(UserForm form) {
		
		boolean suth = false;
		
		UserEntity entity = findById(form.getEmail());
		
		if(form.getPassword().equals(entity.getPassword())) {
			suth = true;
		}

		return suth;
	}
	
	public UserForm save(UserForm form){

		return form;
	}

	public void delete(UserForm form){
		delete(form.getEmail());
	}

	private UserEntity findById(String email) {

		UserEntity entity =new UserEntity();
		entity.setPassword("nca5f502");

		return entity;
	}
	
	
	private void delete(String email){
//		repository.deleteById(email);
	}

}
