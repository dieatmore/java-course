package com.experiment06;

import com.experiment06.entity.Ship;
import com.experiment06.resource.DatabaseUtils;
import com.experiment06.service.Load;
import com.experiment06.service.OverWeightException;

import java.util.logging.ErrorManager;

public class Test {
    public static void main(String[] args) {
        overWeightTest();
    }
    public static void overWeightTest() {
        Ship ship = DatabaseUtils.SHIP;
        try {
            Ship ship1 = Load.load(ship, ship.getBoxes());
            System.out.println(ship1.getName());
        }catch (OverWeightException e){
            e.errowMessage();
        }finally {
            System.out.println("启航");
        }
    }
}
