package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface PerssionServer {



    List<Permission> getPermission(Role role);

    int delPermission(Permission permission);

    int intPermission(Permission permission);

}
