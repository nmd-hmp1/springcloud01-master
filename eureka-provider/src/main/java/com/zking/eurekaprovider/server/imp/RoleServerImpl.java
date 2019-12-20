package com.zking.eurekaprovider.server.imp;

import com.zking.eurekaprovider.mapper.RoleMapper;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.server.RoleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServerImpl implements RoleServer {
    @Autowired
    private RoleMapper roleMapper;





    @Override
    public List<Role> getRole() {
        return roleMapper.listroles();
    }

    @Override
    public int uprple(Role role) {
        return 0;
    }

    @Override
    public int delrole(Role role) {
        return 0;
    }
}
