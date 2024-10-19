package com.crio.qcontest.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.crio.qcontest.entities.User;
import com.crio.qcontest.repositories.IUserRepository;

public class UserService{

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Creates a new user with the specified name.
     * @param name Name of the user.
     * @return Created User object.
     */
    public User createUser(String name) {
        User user = userRepository.save(new User(name));
        return user;
    }

    /**
     * Retrieves a list of users sorted by their score.
     * @param order Sorting order ("ASC" for ascending, "DESC" for descending).
     * @return List of users sorted by score as per the specified order.
     */
    public List<User> showLeaderBoard(String order) {
        List<User> list = userRepository.findAll();
        if(order.equalsIgnoreCase("asc")){
            Collections.sort(list,new LeaderBoardCompAsc());
        }
        else {
            Collections.sort(list,new LeaderBoardCompDesc());
        }
        return list;
    }
}