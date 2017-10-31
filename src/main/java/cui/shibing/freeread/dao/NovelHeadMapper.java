package cui.shibing.freeread.dao;

import cui.shibing.freeread.model.NovelHead;

public interface NovelHeadMapper {
    int deleteByPrimaryKey(Integer novelId);

    int insert(NovelHead record);

    int insertSelective(NovelHead record);

    NovelHead selectByPrimaryKey(Integer novelId);

    int updateByPrimaryKeySelective(NovelHead record);

    int updateByPrimaryKey(NovelHead record);
}