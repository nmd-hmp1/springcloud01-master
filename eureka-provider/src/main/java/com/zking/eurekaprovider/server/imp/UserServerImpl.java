package com.zking.eurekaprovider.server.imp;

import com.zking.eurekaprovider.mapper.PermissionMapper;
import com.zking.eurekaprovider.mapper.UserMapper;
import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//@Service("userServer")
//@Service("userServer")
@Service()
public class UserServerImpl implements UserServer {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public User loadByUsername(User user) {

        return userMapper.selectByPrimaryKey(user);
    }

    @Override
    public List<Permission> listPermissionsByUserName(User user) {
        List<Permission> pe=    userMapper.listPermissionsByUserName(user);
        Permission permission=new Permission();
        for (Permission p:pe) {
            permission.setPermissionId(p.getPermissionId());
            List<Permission> permissions = permissionMapper.listPermissions(permission);
           p.setPermissions(permissions);
        }

           return pe;
    }

    @Override
    public Role listRolesByUserName(User user) {

        return userMapper.listRolesByUserName(user);
    }
}
