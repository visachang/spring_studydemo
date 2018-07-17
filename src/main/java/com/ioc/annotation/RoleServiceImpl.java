package com.ioc.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2018/7/17.
 */
@Component
public class RoleServiceImpl implements RoleService {
    public void printRoleInfo(Role role) {
        System.out.println("id = "+role.getId());
        System.out.println("roleName = "+role.getRoleName());
        System.out.println("note = "+role.getNote());
    }

    public void printRoleInfo() {

    }
}
