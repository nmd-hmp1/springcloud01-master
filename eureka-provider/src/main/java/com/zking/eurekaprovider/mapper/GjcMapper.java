package com.zking.eurekaprovider.mapper;

import com.zking.vo.model.GjcWithBLOBs;

import java.util.List;


public interface GjcMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(GjcWithBLOBs record);

    int insertSelective(GjcWithBLOBs record);

    GjcWithBLOBs selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(GjcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GjcWithBLOBs record);

    int updateByPrimaryKey(GjcWithBLOBs record);

    List<GjcWithBLOBs> list(GjcWithBLOBs record);


    List<GjcWithBLOBs> GjcWithBLOBsActionList(GjcWithBLOBs gjcWithBLOBs);
}