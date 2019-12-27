package com.zking.eurekaprovideranzlyze.controller;

import com.zking.eurekaprovideranzlyze.server.AttentionServer;
import com.zking.eurekaprovideranzlyze.vo.AttentionVo;
import com.zking.vo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("attention")
public class AttentionController {
    @Autowired
    private AttentionServer attentionServer;


    @RequestMapping("selectState")
    public JsonData selectState(){
        JsonData jsonData = new JsonData();
        List<AttentionVo> list = attentionServer.selectState();
        jsonData.setResult(list);
        jsonData.setCode(0);
        return  jsonData;
    }

}
