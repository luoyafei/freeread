package cui.shibing.freeread.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {
	
	@RequestMapping("/")
	public String recommend(Model model) {
		return "pageElement/recommend.base_layout";
	}
	
	@RequestMapping(value="/novelDetails",params="novelId")
	public String novelDetails(Model model,String novelId){
		return "pageElement/novelDetail.no_left_layout";
	}
	
}
