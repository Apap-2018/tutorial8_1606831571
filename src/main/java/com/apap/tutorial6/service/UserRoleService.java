package com.apap.tutorial6.service;

import com.apap.tutorial6.model.UserRoleModel;

public interface UserRoleService{
    UserRoleModel addUser(UserRoleModel user);
    public String encrypt(String password);
    void editPassword(String password, String username);
    UserRoleModel findByUsername(String username);
}