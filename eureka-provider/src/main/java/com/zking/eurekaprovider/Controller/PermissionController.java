package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.mapper.PermissionMapper;
import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.server.PerssionServer;
import com.zking.eurekaprovider.server.UserServer;
import com.zking.eurekaprovider.uitl.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Permission")
public class PermissionController {

@Autowired
    private UserServer userServer;


@Autowired
        private PerssionServer perssionServer;

private  JsonData jsonData;



@RequestMapping("getPermission")
public JsonData selectPrtmissions(User user){
    jsonData=new JsonData();
    List<Permission> permissions = userServer.listPermissionsByUserName(user);
jsonData.setResult(permissions);
jsonData.setCode(0);
    return  jsonData;
}

    @RequestMapping("getPermissiona")
    public JsonData getPrtmissions(Role role){
        jsonData=new JsonData();
        List<Permission> permissions = perssionServer.getPermission(role);
        jsonData.setResult(permissions);
        jsonData.setCode(0);
        return  jsonData;
    }


}
