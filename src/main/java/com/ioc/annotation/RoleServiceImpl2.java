package com.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2018/7/17.
 */
@Component
//@Primary
public class RoleServiceImpl2 implements RoleService {

    @Autowired(required = false)
    private Role role;

    public void printRoleInfo(Role role) {

    }

    public void printRoleInfo() {
        System.out.println("id = "+role.getId());
        System.out.println("roleName = "+role.getRoleName());
        System.out.println("note = "+role.getNote());
    }
}
