package com.zking.eurekaprovideranzlyze.mapper;

import com.zking.eurekaprovideranzlyze.model.Attention;
import com.zking.eurekaprovideranzlyze.vo.AttentionVo;

import java.util.List;

public interface AttentionMapper {
    int deleteByPrimaryKey(Integer attentionId);

    int insert(Attention record);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer attentionId);

    List<AttentionVo> selectState();

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}