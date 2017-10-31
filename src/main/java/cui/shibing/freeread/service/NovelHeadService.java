package cui.shibing.freeread.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cui.shibing.freeread.model.NovelHead;
public interface NovelHeadService {
	/**
	 * 根据小说名称查找小说
	 * @param novelName 要查找的小说名
	 * @return 返回 novelName 对应的小说,如果为null则没有找到
	 * */
	NovelHead searchByNovelName(String novelName);
	
	/**
	 * 根据小说类别查找小说
	 * @param className 小说类别名
	 * @param pageable 分页对象
	 * @return 返回 className 对应的小说
	 * */
	Page<NovelHead> searchByNovelClass(String className,Pageable pageable);
	
	/**
	 * 根据小说的热度差超小说
	 * @param pageable 分页对象
	 * @return 返回相应的小说
	 * */
	Page<NovelHead> searchByPopularity(Pageable pageable);
}
