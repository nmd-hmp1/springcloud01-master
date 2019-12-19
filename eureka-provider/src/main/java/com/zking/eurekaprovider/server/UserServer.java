package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Transactional
public interface UserServer {

    //权限关键接口
    User loadByUsername(User user);//根据用户名查询用户
    List<Permission> listPermissionsByUserName(User user);//查询指定用户拥有的权限
     Role listRolesByUserName(User user);//查询指定用户拥有的角色
}
