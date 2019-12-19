package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.model.User;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Long permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

//根据角色id查询菜单
List<Permission>  getPermission(Role role);

    List<Permission> listPermissions(Permission record);//查询菜单下的子菜单
}