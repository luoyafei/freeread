package cui.shibing.freeread.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import cui.shibing.freeread.CustomDaoTest;
import cui.shibing.freeread.CustomPageable;
import cui.shibing.freeread.model.NovelHead;

public class NovelHeadDaoTest extends CustomDaoTest{
	
	@Autowired
	private NovelHeadDao novelHeadMapper;
	
	@Test
	public void testInsertNovelHeadSuccess() {
		NovelHead novelHead = new NovelHead();
		novelHead.setNovelName("novel1");
		novelHead.setNovelContentTableName("abcd");
		novelHead.setNovelContentId(123);
		novelHead.setNovelClass(1);
		novelHead.setNovelStatus(12);
		novelHead.setNovelChapterNum(123);
		assertTrue(novelHeadMapper.insertNovelHead(novelHead) == 1);
	}
	
	@Test
	public void testSelectNovelHeadByNameFail() {
		executeSqlScript("novel_head_insert-1.sql",false);
		Pageable pageable = new CustomPageable(1,5);
		List<NovelHead> novelHeads = novelHeadMapper.selectNovelHeadByNovelName("1", pageable);
		assertTrue(novelHeads.size()==0);
	}
	
	@Test
	public void testSelectNovelHeadByNameSuccess() {
		executeSqlScript("novel_head_insert-1.sql",false);
		Pageable pageable = new CustomPageable(1,5);
		List<NovelHead> novelHeads = novelHeadMapper.selectNovelHeadByNovelName("zhe tian", pageable);
		assertTrue(novelHeads.size()==1);
		assertTrue(novelHeads.get(0).getNovelName().equals("zhe tian"));
	}
	
	@Test
	public void testSelectNovelHeadByClassName() {
		//TODO:–¢Š®
		Pageable pageable = new CustomPageable(1,5);
		List<NovelHead> novelHeads = novelHeadMapper.selectNovelHeadByNovelName("novel1",pageable);
		assertTrue(novelHeads.size()==1);
	}
	
}
