package nca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("edit")
public class EditController {

	@Autowired
	EditService service;
	
	@GetMapping
	public String index(Model model, UserForm form) {
		log.info("変更コントローラー（" + form.getEmail() + "）");
		// DBから選択したユーザー情報を取得する
		form = service.findById(form);
		// 画面にフォーム情報を渡すためモデルに追加する
		model.addAttribute("form", form);
		return "edit";
	}

	@PostMapping(path="action")
	public String action(Model model, UserForm form) {
		log.info("変更コントローラー：変更処理実行");
		form = service.save(form);
		return "edit_msg";
	}

	@PostMapping(path="delete")
	public String delete(Model model, UserForm form) {
		log.info("変更コントローラー：削除処理実行");
		service.delete(form);
		return "edit_msg";
	}
	
}
