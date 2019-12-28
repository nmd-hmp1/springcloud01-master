package com.zking.eurekaprovider.server;

import com.zking.vo.model.AuditCause;
import com.zking.vo.model.GjcWithBLOBs;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AuditCauseServer {


List<AuditCause>  AuditCauseList(GjcWithBLOBs gjc);


int insertAuditCause(AuditCause auditCause);
}
