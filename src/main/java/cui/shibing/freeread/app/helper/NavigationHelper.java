package cui.shibing.freeread.app.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import cui.shibing.freeread.model.NovelClass;
import cui.shibing.freeread.service.NovelClassService;

@Component
public class NavigationHelper{
	public static volatile String HEAD_PAGE = "header/navigation";
	@Autowired
	private NovelClassService novelClassService;

	public void generateHeaderData(Model model) {
		List<NovelClass> allNovelClass = novelClassService.getAllNovelClass();
		model.addAttribute("allNovelClass",allNovelClass);
	}

	public String generateHeaderPage(Model model) {
		this.generateHeaderData(model);
		return HEAD_PAGE;
	}

	public void setHeadPage(String headPage) {
		HEAD_PAGE = headPage;
	}
	
}
