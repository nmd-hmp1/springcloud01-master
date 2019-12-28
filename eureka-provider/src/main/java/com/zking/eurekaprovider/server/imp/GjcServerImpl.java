package com.zking.eurekaprovider.server.imp;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovider.mapper.AuditCauseMapper;
import com.zking.eurekaprovider.mapper.GjcMapper;
import com.zking.eurekaprovider.server.GjcServer;

import com.zking.vo.model.AuditCause;
import com.zking.vo.model.GjcWithBLOBs;
import com.zking.vo.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GjcServerImpl implements GjcServer {

    @Autowired(required=true)
    private GjcMapper gjcMapper;

    @Autowired
    private AuditCauseMapper auditCauseMapper;
    @Override
    public List<GjcWithBLOBs> list(GjcWithBLOBs GjcWithBLOBs, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<GjcWithBLOBs> gjcWithBLOBs = gjcMapper.list(GjcWithBLOBs);


        for (GjcWithBLOBs gjcwith : gjcWithBLOBs) {
            AuditCause auditCause=new AuditCause();
            auditCause.setGid((long)gjcwith.getGid());
            List<AuditCause> auditCauses = auditCauseMapper.AuditCauseList(auditCause);
            gjcwith.setAuditCauseList(auditCauses);

        }
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(gjcWithBLOBs);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return gjcWithBLOBs;
    }

    @Override
    public List<GjcWithBLOBs> GjcWithBLOBsActionList(GjcWithBLOBs GjcWithBLOBs, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<GjcWithBLOBs> gjcWithBLOBs = gjcMapper.GjcWithBLOBsActionList(GjcWithBLOBs);
        for (GjcWithBLOBs gjcwith : gjcWithBLOBs) {
            AuditCause auditCause=new AuditCause();
            auditCause.setGid((long)gjcwith.getGid());
            List<AuditCause> auditCauses = auditCauseMapper.AuditCauseList(auditCause);
            gjcwith.setAuditCauseList(auditCauses);
        }
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(gjcWithBLOBs);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return gjcWithBLOBs;
    }

    @Override
    public int upGjc(GjcWithBLOBs gjcWithBLOBs) {
        return gjcMapper.updateByPrimaryKeySelective(gjcWithBLOBs);
    }

    @Override
    public int intGjc(GjcWithBLOBs gjcWithBLOBs) {
        return gjcMapper.insertSelective(gjcWithBLOBs);
    }
}
