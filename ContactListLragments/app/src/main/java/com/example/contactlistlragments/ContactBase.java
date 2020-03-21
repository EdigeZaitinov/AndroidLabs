package com.example.contactlistlragments;

import android.app.Application;

import java.util.ArrayList;

public class ContactBase extends Application {

    public static ArrayList<Contact> people;

    public void onCreate() {
        super.onCreate();
        people=new ArrayList<>();
        people.add(new Contact("Edige","Zaitinov"));
        people.add(new Contact("Rasul","Zaitin"));
        people.add(new Contact("Nurmuhamed","Zaitin"));
    }
}
