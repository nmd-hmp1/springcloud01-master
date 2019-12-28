package com.zking.eurekaprovider.mapper;

import com.zking.vo.model.AuditCause;

import java.util.List;

public interface AuditCauseMapper {
    int deleteByPrimaryKey(Long ghid);

    int insert(AuditCause record);

    int insertSelective(AuditCause record);

    AuditCause selectByPrimaryKey(Long ghid);

    int updateByPrimaryKeySelective(AuditCause record);

    int updateByPrimaryKey(AuditCause record);

    List<AuditCause >  AuditCauseList(AuditCause auditCause);
}