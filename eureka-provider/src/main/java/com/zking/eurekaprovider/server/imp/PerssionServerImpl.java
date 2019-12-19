package com.zking.eurekaprovider.server.imp;

import com.zking.eurekaprovider.mapper.PermissionMapper;
import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.server.PerssionServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PerssionServerImpl implements PerssionServer {


    @Autowired
   private   PermissionMapper permissionMapper;



    @Override
    public List<Permission> getPermission(Role role) {
        List<Permission> permission = permissionMapper.getPermission(role);
        for ( Permission ss: permission) {
            List<Permission> permissions = permissionMapper.listPermissions(ss);
            ss.setPermissions(permissions);
            for (Permission per :permissions) {
                List<Permission> permissionsb = permissionMapper.listPermissions(per);
                per.setPermissions(permissionsb);
            }
        }

        return permission;
    }
    @Override
    public int delPermission(Permission permission) {

//        return permissionMapper.deleteByPrimaryKey();
        return  0;
    }

    @Override
    public int intPermission(Permission permission) {
        return 0;
    }
}
