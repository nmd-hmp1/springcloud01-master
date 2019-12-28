package com.zking.eurekaprovider.server.imp;

import com.zking.eurekaprovider.mapper.AuditCauseMapper;
import com.zking.eurekaprovider.server.AuditCauseServer;
import com.zking.vo.model.AuditCause;
import com.zking.vo.model.GjcWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuditCauseServerImpl implements AuditCauseServer {



    @Autowired
    private AuditCauseMapper auditCauseMapper;
    @Override
    public List<AuditCause> AuditCauseList(GjcWithBLOBs gjc) {
        return null;
    }

    @Override
    public int insertAuditCause(AuditCause auditCause) {
        return auditCauseMapper.insertSelective(auditCause);
    }
}
