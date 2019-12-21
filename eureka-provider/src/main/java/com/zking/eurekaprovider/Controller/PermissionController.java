package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.mapper.PermissionMapper;
import com.zking.eurekaprovider.mapper.RoleMapper;
import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.server.PerssionServer;
import com.zking.eurekaprovider.server.UserServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.eurekaprovider.uitl.MyLog;
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

@Autowired
private RoleMapper roleMapper;
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
    public JsonData getPrtmissions(){
        List<Role> listroles = roleMapper.listroles();
        System.out.println(listroles.size());
        for (Role r :listroles) {
            System.out.println(r.gettRoleName());

            List<Permission> permissions = perssionServer.getPermission(r);
            r.setPermission(permissions);
        }
        jsonData=new JsonData();

        jsonData.setResult(listroles);
        jsonData.setCode(0);
        return  jsonData;
    }
    @MyLog(value = "用户增加")
    @RequestMapping("abc")
    public JsonData abcrty(String ac){
        List<Role> listroles = roleMapper.listroles();
        jsonData=new JsonData();

        jsonData.setResult(listroles);
        jsonData.setCode(0);
        return  jsonData;
    }
}
