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
@RequestMapping("add")
public class AddController {
	
	@Autowired
	EditService service;

	@GetMapping
	public String index(Model model, UserForm form) {
		log.info("新規登録コントローラー");
		form.setName("名前");
		form.setKana("カナ");
		form.setBirthday("生年月日");
		form.setGender("性別");
		form.setBloodtype("O");
		form.setEmail("user@domain.com");
		form.setTel("tel");
		form.setZip("zip");
		form.setAddress("愛知県名古屋市中区1-10");
		form.setPassword("password");
		model.addAttribute("form", form);
		return "add";
	}

	@PostMapping(path="action")
	public String action(Model model, UserForm form) {
		log.info("新規登録コントローラー：登録処理実行");
		form = service.save(form);
		return "add_msg";
	}
	
}
