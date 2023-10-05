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
@RequestMapping({"menu"})
public class MenuController {

	@Autowired
	MenuService service;

	@PostMapping
	public String index(Model model, UserForm form) {
		log.info("メニューコントローラー");
		String ret = "login";
		if(service.isAuth(form)) {
			ret = "menu";
		}
		return ret;
	}

	@GetMapping
	public String back() {
		log.info("メニューコントローラー戻り処理");
		return "menu";
	}
	
}
