package nca;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("search")
public class SearchController {

	@GetMapping
	public String index(Model model, UserForm form) {
		log.info("検索コントローラー");
		ArrayList<String> preflist = new ArrayList<String>();
		preflist.add("北海道");
		preflist.add("青森県");
		preflist.add("岩手県");
		preflist.add("宮城県");
		preflist.add("秋田県");
		preflist.add("山形県");
		preflist.add("福島県");
		preflist.add("茨城県");
		preflist.add("栃木県");
		preflist.add("群馬県");
		preflist.add("埼玉県");
		preflist.add("千葉県");
		preflist.add("東京都");
		preflist.add("神奈川県");
		preflist.add("新潟県");
		preflist.add("富山県");
		preflist.add("石川県");
		preflist.add("福井県");
		preflist.add("山梨県");
		preflist.add("長野県");
		preflist.add("岐阜県");
		preflist.add("静岡県");
		preflist.add("愛知県");
		preflist.add("三重県");
		preflist.add("滋賀県");
		preflist.add("京都府");
		preflist.add("大阪府");
		preflist.add("兵庫県");
		preflist.add("奈良県");
		preflist.add("和歌山県");
		preflist.add("鳥取県");
		preflist.add("島根県");
		preflist.add("岡山県");
		preflist.add("広島県");
		preflist.add("山口県");
		preflist.add("徳島県");
		preflist.add("香川県");
		preflist.add("愛媛県");
		preflist.add("高知県");
		preflist.add("福岡県");
		preflist.add("佐賀県");
		preflist.add("長崎県");
		preflist.add("熊本県");
		preflist.add("大分県");
		preflist.add("宮崎県");
		preflist.add("鹿児島県");
		preflist.add("沖縄県");
		model.addAttribute("preflist", preflist);
		model.addAttribute("form", form);
		return "search";
	}
	
}
