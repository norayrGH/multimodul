package com.skillsimprover.service;

import dao.UserDAO;
import domain.User;
import jdbc.UserDaoImpl;

import java.util.List;

public class UserService {
    public List<User>  getAllUsers(){
        UserDAO dao =  new UserDaoImpl();
       return dao.loadAllUsers();
    }
}
