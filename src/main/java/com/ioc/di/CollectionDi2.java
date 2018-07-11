package com.ioc.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lenovo on 2018/7/9.
 */
public class CollectionDi2 {
    private Set<Role> set;
    private List<User> list;
    private Map<Role,User> map;

    public Set<Role> getSet() {
        return set;
    }

    public void setSet(Set<Role> set) {
        this.set = set;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<Role, User> getMap() {
        return map;
    }

    public void setMap(Map<Role, User> map) {
        this.map = map;
    }
}
