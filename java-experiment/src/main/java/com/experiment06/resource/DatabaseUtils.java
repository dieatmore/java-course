package com.experiment06.resource;

import com.experiment06.entity.Box;
import com.experiment06.entity.Ship;

public class DatabaseUtils {
    public static final Ship SHIP = creat();
    public static Ship creat() {
        Box box1 = new Box(1, 20);
        Box box2 = new Box(2,30);
        Box box3 = new Box(3, 10);
        Box box4 = new Box(4,15);
        Box[] boxes= {box1,box2,box3,box4};
        Ship ship1 = new Ship(1, "泰坦尼克号", 60, boxes);
        return ship1;
    }
}
