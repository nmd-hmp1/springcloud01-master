package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.mapper.RoleMapper;
import com.zking.eurekaprovider.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface RoleServer {


//     RoleMapper rolemapper;
List<Role> getRole();


int uprple(Role role);

int  delrole(Role role);





}
