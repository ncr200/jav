package nca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping({"list"})
public class ListController {

	@Autowired
	ListService service;

	@GetMapping
	public String index(Model model, UserForm form) {

		log.info("検索コントローラー");

		System.out.println("カナ　　：　" + form.getKana());
		System.out.println("血液型　：　" + form.getBloodtype());
		System.out.println("都道府県：　" + form.getAddress());
		
		model.addAttribute("list", service.search(form));
		
		return "list";
	}
	
}
