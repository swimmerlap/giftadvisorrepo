package com.company;

public class Gift
{


    private String gender;
    private String price;
    private String gift;

    public Gift(String gender, String price, String gift) {
        this.gender = gender;
        this.price = price;
        this.gift = gift;
    }


    public Gift() {           //default constructor

    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }




}
