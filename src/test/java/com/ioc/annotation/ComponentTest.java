package com.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lenovo on 2018/7/15.
 */
public class ComponentTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);

//        Role role = (Role)context.getBean("role");
//        RoleService roleService = (RoleServiceImpl)context.getBean("roleServiceImpl");
//        roleService.printRoleInfo(role);

//        RoleService roleService = (RoleServiceImpl2)context.getBean("roleServiceImpl2");
//        roleService.printRoleInfo();

        RoleController roleController = (RoleController)context.getBean("roleController");
        roleController.print();
    }
}
