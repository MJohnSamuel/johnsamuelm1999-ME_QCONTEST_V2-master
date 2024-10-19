package com.crio.qcontest.services;

import java.util.Comparator;
import com.crio.qcontest.entities.User;

public class LeaderBoardCompDesc implements Comparator<User> {

    @Override
    public int compare(User arg0, User arg1) {
        // TODO Auto-generated method stub
        if(arg0.getScore()>arg1.getScore()){
            return -1;
        }
        else if(arg0.getScore()<arg1.getScore()){
            return 1;
        }
        return 0;
    }

}
    