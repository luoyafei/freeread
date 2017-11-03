package cui.shibing.freeread.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cui.shibing.freeread.model.NovelHead;
import cui.shibing.freeread.service.NovelHeadService;

@Controller
public class LayoutController {
	
	@Autowired
	private NovelHeadService novelHeadService;
	
	@RequestMapping("/")
	public String recommend(Model model) {
		return "recommend.base_layout";
	}
	
	@RequestMapping(value="/novelDetails",params="novelId")
	public String novelDetails(Model model,String novelId){
		NovelHead novelHead = novelHeadService.searchByNovelId(novelId);
		model.addAttribute("novelHead", novelHead);
		return "novel_details.no_left_layout";
	}
	
}
