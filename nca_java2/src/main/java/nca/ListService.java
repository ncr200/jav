package nca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class ListService {

	@Autowired
	UserRepository repository;
	
	// 引数として検索条件（ここではフォーム）を受け取り、
	// DBから条件にマッチした情報（ユーザーリスト）を受け取りコントローラーに返す
	public List<UserForm> search(UserForm where){

		// 引数の情報をコンソールに出力　※本番ではなくてよい
		System.out.println(where.toString());
		
		// リポジトリのインスタンスを生成する　スタブ
		// 実際にDBに接続するときは、13-14行目で生成するので
		// 本番では削除
//		UserRepositoryStub repository = new UserRepositoryStub();
		
		// ユーザーフォームの変数を準備
		UserForm form = null;
		
		// DBから受け取ったユーザー情報をentityListに格納する
		//List<UserEntity> entityList = repository.findAll();

		if(Objects.isNull(where.getBloodtype())) {
			where.setBloodtype("%%");
		}
		List<UserEntity> entityList = repository.findByKanaContainingAndBloodtypeLikeAndAddressStartingWith(where.getKana(), where.getBloodtype(), where.getAddress());
		
		// ユーザーフォームリストのインスタンスを生成する
		ArrayList<UserForm> formList = new ArrayList<UserForm>();
		
		// DBから受け取ったユーザー情報をフォームに移す
		// ここで例えばDBで「姓」「名」と項目が分かれていたとき
		// フォームの「name」に「姓＋"　"+名」と結合して入れたりする
		for(UserEntity entity : entityList) { //←拡張for文　for( データ1件格納変数 : データリスト)
			
			// フォームのインスタンスを生成する
			form = new UserForm();
			
			// DBの情報をフォームにコピーする　※同じ変数名かつ同じ型の情報をコピーできるメソッド
			BeanUtils.copyProperties(entity, form);
			
			// フォームリストにフォームを追加する
			formList.add(form);
		}
		
		// フォームリストを戻り値として呼び出し元に返す
		return formList;
	}
	
	
	
}
