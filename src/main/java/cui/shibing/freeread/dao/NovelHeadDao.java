package cui.shibing.freeread.dao;

import cui.shibing.freeread.model.NovelHead;

public interface NovelHeadDao {
    int deleteByPrimaryKey(Integer novelId);

    int insert(NovelHead record);

    NovelHead selectByPrimaryKey(Integer novelId);

    int updateByPrimaryKey(NovelHead record);
}