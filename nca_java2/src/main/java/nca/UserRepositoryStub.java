package nca;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryStub {

	public UserEntity findById(String email) {
		UserEntity entity = new UserEntity();
		entity.setName("名前");
		entity.setKana("カナ");
		entity.setBirthday("生年月日");
		entity.setGender("性別");
		entity.setBloodtype("O");
		entity.setEmail("user@domain.com");
		entity.setTel("tel");
		entity.setZip("zip");
		entity.setAddress("愛知県名古屋市中区1-10");
		entity.setPassword("password");
		return entity;
	}
	
	
	public List<UserEntity> findAll(){
		String[] b = {"A", "O", "B", "AB"};
		String[] c = {"M", "F", "U"};
		UserEntity entity = null;
		List<UserEntity> list = new ArrayList<UserEntity>();
		for(int i=0; i<10; i++) {
			entity = new UserEntity();
			entity.setName("名前"+i);
			entity.setKana("カナ"+i);
			entity.setBirthday("生年月日"+i);
			entity.setGender(c[i%2]);
			entity.setBloodtype(b[i%3]);
			entity.setEmail(i+"user@domain.com");
			entity.setTel("tel"+i);
			entity.setZip("zip"+i);
			entity.setAddress("愛知県名古屋市中区1-"+i);
			entity.setPassword("password"+i);
			list.add(entity);
		}
		return list;
	}
}
