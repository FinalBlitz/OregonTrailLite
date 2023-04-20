package org.yup.oregontrail;

public class OregonTrailApp {
    public static void main(String[] args){

        Traveler Final = new Traveler("Final", 1000, 50);

        System.out.println("before hunting food: " + Final.getFood());
        System.out.println(Final.hunt());
        System.out.println("After hunting " + Final.getFood());
        System.out.println(Final.hunt());
        System.out.println(Final.eat());
        System.out.println(Final.eat());
        System.out.println(Final.eat());
        System.out.println(Final.eat());
    }

}
