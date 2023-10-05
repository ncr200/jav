package nca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping({"/","/index"})
public class NcaJava2Controller {

	@GetMapping
	public String index() {
		log.info("こんにちは　スプリングブート");
		return "index";
	}
	
}
