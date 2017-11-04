package cui.shibing.freeread.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LayoutController {

	@RequestMapping("/")
	public String recommend(Model model) {
		return "pageElement/recommend.base_layout";
	}

	@RequestMapping(value = "/novelDeatil", params = "novelId")
	public String novelDetails(Model model) {
		return "pageElement/novelDeatil.no_left_layout";
	}

}
