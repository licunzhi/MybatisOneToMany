package com.licunzhi.domain;

import com.licunzhi.model.Tenant;
import com.licunzhi.model.User;

import java.util.List;

/**
 * @author licunzhi
 * @desc 描述功能
 * @date 2018-05-31
 */
public class TenantVo extends Tenant {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
