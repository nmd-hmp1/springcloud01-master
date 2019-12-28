package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.server.GjcServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.eurekaprovider.uitl.MyLog;
import com.zking.vo.model.GjcWithBLOBs;
import com.zking.vo.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Gjc")
public class Gjccontroller {
    @Autowired
    private GjcServer gjcServer;


private JsonData jsonData;
@MyLog("关键词查询")
@RequestMapping("Gjclist")
public JsonData    List(GjcWithBLOBs gjc, PageBean pageBean){
    jsonData=new JsonData();
    if(null==gjc.getGjc()||"".equals(gjc.getGjc())){
gjc.setGjc("");
    }

    List<GjcWithBLOBs> list = gjcServer.list(gjc,pageBean);
    jsonData.setCode(0);
 jsonData.setResult(list);
 jsonData.setRows(pageBean.getRows());
 jsonData.setPage(pageBean.getPage());
 jsonData.setTotal(pageBean.getTotal());
    return jsonData;
}



    @MyLog("关键词修改")
    @RequestMapping("upGjc")
public  JsonData upGjc(GjcWithBLOBs gjc){
    jsonData =new JsonData();
        int i = gjcServer.upGjc(gjc);
if(0<i){
jsonData.setCode(0);
jsonData.setResult("修改成功");
}else{
    jsonData.setCode(-1);
    jsonData.setResult("修改失败");
}

        return jsonData;
}


    @MyLog("关键词添加")
    @RequestMapping("inGjc")
    public  JsonData inGjc(GjcWithBLOBs gjc){
        jsonData =new JsonData();
        int i = gjcServer.intGjc(gjc);
        if(0<i){
            jsonData.setCode(0);
            jsonData.setResult("添加成功");
        }else{
            jsonData.setCode(-1);
            jsonData.setResult("添加失败");
        }

        return jsonData;
    }


    @MyLog("根据状态查询关键词")
    @RequestMapping("GjcWithBLOBsActionList")
    public  JsonData GjcWithBLOBsActionList(GjcWithBLOBs gjc, PageBean pageBean){
        jsonData =new JsonData();
        List<GjcWithBLOBs> gjcWithBLOBs = gjcServer.GjcWithBLOBsActionList(gjc, pageBean);
       jsonData.setResult(gjcWithBLOBs);
       jsonData.setCode(0);
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setTotal(pageBean.getTotal());
        return jsonData;
    }

}
