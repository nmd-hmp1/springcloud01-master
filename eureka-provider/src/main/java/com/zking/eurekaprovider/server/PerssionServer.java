package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.vo.model.RolePermission;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@CacheConfig(cacheNames = {"Permissioncachs"})
public interface PerssionServer {


//    @Cacheable(value = "Permisscachs",key = "'Roid-'+#role.gettRoleId()",unless = "#result.size()==0")
    List<Permission> getPermission(Role role);


//    @Cacheable(value = "getPermissions",key = "'Roid-1'",unless = "#result.size()==0")
    List<Permission> getPermissions();

    int delPermission(RolePermission rolePermission);

    int intPermission(RolePermission rolePermission);

}
