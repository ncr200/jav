package nca;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditService {

	@Autowired
	UserRepository repository;

	public UserForm findById(UserForm form) {
		// findByIdメソッドを実行する
		UserEntity entity = findById(form.getEmail());
		// DBから取得したユーザー情報をFormにコピーする
		BeanUtils.copyProperties(entity,form);
		// フォームを返す
		return form;
	}

	private UserEntity findById(String email) {
		
		// エンティティの変数を準備する
		UserEntity entity = null;
		// オプショナルは、検索結果が0件のときに
		// nullの処理ができるようにオプショナルで受け取ります
		Optional<UserEntity> optional = repository.findById(email);
		// エンティティが存在するか（DBから情報が取得できた）
		if (optional.isPresent()) {
			// オプショナルからエンティティを取得する
			entity = optional.get();
		}
		// 取得したエンティティ（DBから取得したユーザー情報）
		return entity;
	}

	public UserForm save(UserForm form){
		// 登録更新用のエンティティのインスタンスを生成する
		UserEntity entity = new UserEntity();
		// フォームで入力した情報をエンティティにコピーする
		BeanUtils.copyProperties(form, entity);
		// DBに（登録）更新をかける　※saveメソッドはinsert,updateとも同じ
		entity = repository.save(entity);
		// 更新したエンティティ情報をフォームにコピーする
		BeanUtils.copyProperties(entity, form);
		return form;
	}

	public void delete(UserForm form){
		delete(form.getEmail());
	}

	public void delete(String email){
		repository.deleteById(email);
	}

}
