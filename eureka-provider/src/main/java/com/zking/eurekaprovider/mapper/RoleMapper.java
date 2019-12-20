package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long tRoleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long tRoleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    List<Role>  listroles();
}