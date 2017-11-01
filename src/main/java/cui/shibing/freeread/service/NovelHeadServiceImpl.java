package cui.shibing.freeread.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cui.shibing.freeread.dao.NovelHeadMapper;
import cui.shibing.freeread.model.NovelHead;

@Service
public class NovelHeadServiceImpl implements NovelHeadService {

	@Autowired
	private NovelHeadMapper novelHeadMapper;

	public Page<NovelHead> searchByNovelClass(String className,
			Pageable pageable) {
		List<NovelHead> result = null;

		if (StringUtils.isEmpty(className) || pageable == null) {
			result = Collections.emptyList();
		} else {
			result = novelHeadMapper.selectByNovelClass(className, pageable);
		}
		return new PageImpl<NovelHead>(result);
	}

	public Page<NovelHead> searchByPopularity(Pageable pageable) {
		List<NovelHead> result = null;

		if (pageable == null) {
			result = Collections.emptyList();
		} else {
			result = novelHeadMapper.selectByPopularity(pageable);
		}
		return new PageImpl<NovelHead>(result);
	}

	public Page<NovelHead> searchByNovelName(String novelName, Pageable pageable) {
		List<NovelHead> result = null;

		if (StringUtils.isEmpty(novelName) || pageable == null) {
			result = Collections.emptyList();
		} else {
			result = novelHeadMapper.selectByNovelName(novelName, pageable);
		}
		return new PageImpl<NovelHead>(result);
	}

}
