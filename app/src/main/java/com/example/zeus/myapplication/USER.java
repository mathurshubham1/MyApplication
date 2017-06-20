package com.example.zeus.myapplication;

import java.util.ArrayList;

/**
 * Created by ZEUS on 20-06-2017.
 */

public class USER {
    public String subjectname;
    public String skillname;
    public String level;

    public USER(String name, String hometown, String levelno) {
        this.subjectname = name;
        this.skillname = hometown;
        this.level = levelno;
    }
    public static ArrayList<USER> getUsers() {
        ArrayList<USER> users = new ArrayList<USER>();
        users.add(new USER("Subject 1", "Skill 1","1"));
        users.add(new USER("Subject 2", "Skill 2","2"));
        users.add(new USER("Subject 3", "Skill 3","3"));
        users.add(new USER("Subject 4","Skill 4","4"));
        return users;
    }
}
