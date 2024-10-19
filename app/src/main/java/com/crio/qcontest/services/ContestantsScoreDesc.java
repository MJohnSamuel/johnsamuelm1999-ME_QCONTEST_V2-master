package com.crio.qcontest.services;

import java.util.Comparator;
import com.crio.qcontest.entities.Contestant;

public class ContestantsScoreDesc implements Comparator<Contestant> {

    @Override
    public int compare(Contestant arg0, Contestant arg1) {
        // TODO Auto-generated method stub
        if(arg0.getTotalScore()<arg1.getTotalScore()){
            return 1;
        }
        else if(arg0.getTotalScore()>arg1.getTotalScore()){
            return -1;
        }
        return 0;
    }
    
}
