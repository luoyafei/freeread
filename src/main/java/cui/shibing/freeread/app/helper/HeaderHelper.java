package cui.shibing.freeread.app.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import cui.shibing.freeread.model.NovelClass;
import cui.shibing.freeread.service.NovelClassService;

@Component
public class HeaderHelper {
	
	@Autowired
	private NovelClassService novelClassService;
	
	public void setNovelClasses(Model model){
		List<NovelClass> allNovelClass = novelClassService.getAllNovelClass();
		model.addAttribute("allNovelClass",allNovelClass);
	}
	
}
