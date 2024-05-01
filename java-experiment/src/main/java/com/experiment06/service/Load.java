package com.experiment06.service;

import com.experiment06.entity.Box;
import com.experiment06.entity.Ship;

public class Load {
    public static Ship load(Ship ship, Box[] boxes) throws OverWeightException{
        int num= 0;
        for (Box i : boxes){
            num += i.getWeight();
        }
        if(num >= ship.getWeight()) {
            int overWeight = num - ship.getWeight();
            throw new OverWeightException(ship.getId(),ship.getName(),overWeight);
        }
        return ship;
    }
}
