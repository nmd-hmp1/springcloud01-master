package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.mapper.GjcMapper;
import com.zking.eurekaprovider.server.AuditCauseServer;
import com.zking.eurekaprovider.server.GjcServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.eurekaprovider.uitl.MyLog;
import com.zking.vo.model.AuditCause;
import com.zking.vo.model.GjcWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("AuditCause")
public class AuditCausecontroller {

    @Autowired
    private AuditCauseServer auditCauseServer;
    @Autowired
    private GjcServer gjcServer;

    private JsonData jsonData;
@MyLog("添加审核")
@RequestMapping("inAuditCause")
    public JsonData insertAuditCause(AuditCause auditCause, GjcWithBLOBs gjcWithBLOBs){
    System.out.println(gjcWithBLOBs);
    System.out.println(auditCause);
        jsonData=new JsonData();
        gjcWithBLOBs.setAction(auditCause.getAaction());
int a=    gjcServer.upGjc(gjcWithBLOBs);
        int i = auditCauseServer.insertAuditCause(auditCause);
        if(i>0){
jsonData.setCode(0);
jsonData.setMessage("添加成功");
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("添加失败");
        }

    System.out.println(a);
    System.out.println(i);
        return  jsonData;
    };


}
