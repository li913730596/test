package org.example;

import org.apache.thrift.TException;

import java.util.HashMap;
import java.util.Map;

public class UserServiceHandler implements UserService.Iface {
    private final Map<Integer, User> userMap = new HashMap<>();

    @Override
    public User getUserById(int id) throws TException {
        System.out.println("Getting user with ID: " + id);
        return userMap.get(id);
    }

    @Override
    public void saveUser(User user) throws TException {
        System.out.println("Saving user: " + user);
        userMap.put(user.id, user);
    }
}
