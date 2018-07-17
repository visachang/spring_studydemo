package com.ioc.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/7/17.
 */
@Component
public class RoleController {
//    @Autowired
//    @Qualifier("roleServiceImpl2")
    @Resource(name = "roleServiceImpl2")
    private RoleService roleService;

    public void print(){
        roleService.printRoleInfo();
    }
}
