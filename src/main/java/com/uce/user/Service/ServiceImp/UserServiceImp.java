package com.uce.user.Service.ServiceImp;

import java.util.List;



import com.uce.user.Model.User;

public interface UserServiceImp {
    User registerUser(User user);

    User findByUser(Long id);

    List<User> getAll();
}
