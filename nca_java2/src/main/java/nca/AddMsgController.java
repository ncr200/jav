package nca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("add_msg")
public class AddMsgController {

	@PostMapping
	public String index() {
		log.info("新規登録実行コントローラー");
		return "add_msg";
	}
	
}
