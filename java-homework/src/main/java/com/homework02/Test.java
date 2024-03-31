package com.homework02;

public class Test {
    public static void main(String[] args) {
        Button b1 = new Button("点击");
        b1.setClickable(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("进入");
            }
        });
        Button b2 = new Button("滑动");
        b2.setClickable(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("下一页");
            }
        });
        b1.getClickable().onClick();
        b2.getClickable().onClick();
    }
}
