package com.company;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Gift> Gifts = new ArrayList<>();
        Gifts.add(new Gift("Female", "High", "Jewlery"));
        Gifts.add(new Gift("Female", "High", "Weekend"));
        Gifts.add(new Gift("Female", "Low", "Selfie Stick"));
        Gifts.add(new Gift("Female", "Low", "Wine Bottle"));
        Gifts.add(new Gift("Female", "Medium", "Perfume"));
        Gifts.add(new Gift("Female", "Medium", "Sweater"));
        Gifts.add(new Gift("Male", " High", "Smart TV"));
        Gifts.add(new Gift("Male", "High", "Apple Watch"));
        Gifts.add(new Gift("Male", "Low", "Books"));
        Gifts.add(new Gift("Male", "Low", "Shoes"));
        Gifts.add(new Gift("Male", "Medium", "Guitar"));
        Gifts.add(new Gift("Male", "Medium", "Playstation"));


        Scanner in = new Scanner(System.in);
        System.out.println("Enter gender: ");
        String gender = in.nextLine();
        System.out.println("Enter Price: ");
        String price = in.nextLine();

        for (Gift g : Gifts) {
            if (g.getGender().equalsIgnoreCase(gender) && g.getPrice().equalsIgnoreCase(price)) {
                System.out.println(g.getGift());
            }
        }
    }
}



