package nca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping({"login"})
public class LoginController {

	@GetMapping
	public String index() {
		log.info("ログインコントローラー");
		return "login";
	}
	
}
