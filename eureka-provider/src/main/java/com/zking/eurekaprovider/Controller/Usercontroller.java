package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.server.UserServer;
import com.zking.eurekaprovider.shiro.PasswordHelper;
import com.zking.eurekaprovider.uitl.JsonData;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("User")
public class Usercontroller {
private JsonData jsonData;
@Autowired
private UserServer userServer;
    @RequestMapping("/login")
    public JsonData login(User user) {
        jsonData=new JsonData();
        System.out.println(user);
        User user1 = userServer.loadByUsername(user);
        System.out.println(user1.getUserAccountnmber());
        if(null==user1){
            jsonData.setCode(1);
            jsonData.setMessage("账户不存在");
        }
        else if(user1.getLocked()==1){
            jsonData.setCode(1);
            jsonData.setMessage("账户被锁定");
        }
        else{
            boolean b = PasswordHelper.checkCredentials(user.getUserCipher(),user1.getUserKey(),user1.getUserCipher());
          Role role = userServer.listRolesByUserName(user1);
            Map<String,Object> map=new HashMap<String,Object>();
            if(b){
                map.put("role",role);
                map.put("sysUser",user1);
                jsonData.setCode(0);
                jsonData.setMessage("成功");
                jsonData.setResult(map);
            }else{
                jsonData.setCode(1);
                jsonData.setMessage("密码或用户名错误");
            }
        }
        return  jsonData;
    }


}
