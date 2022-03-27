package com.company;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(3);
        System.out.println(cylinder);
        cylinder=new Cylinder(2,"yellow",6);
        System.out.println(cylinder);
    }


}
