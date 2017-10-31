package cui.shibing.freeread.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import cui.shibing.freeread.model.NovelHead;

public interface NovelHeadMapper {
    int deleteByPrimaryKey(Integer novelId);

    int insert(NovelHead record);

    int insertSelective(NovelHead record);

    NovelHead selectByPrimaryKey(Integer novelId);

    int updateByPrimaryKeySelective(NovelHead record);

    int updateByPrimaryKey(NovelHead record);
    
    List<NovelHead> selectByNovleName(@Param("novelName")String novelName,@Param("pageable")Pageable pageable);
    
    List<NovelHead> selectByNovelClass(String novelClassName,Pageable pageable);
    
    List<NovelHead> selectByPopularity(Pageable pageable);
}