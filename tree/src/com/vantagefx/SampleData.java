package com.vantagefx;

import java.util.HashMap;
import java.util.Map;

public class SampleData {

	//relationMap is storing user relation information
	//key is user id, value is parent user id (null means this user is root user and does not have parent)
    private static Map<Integer, Integer> relationMap = new HashMap<>();
    
    //userMap is storing users' data
    //key is user id, value is user object
    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        relationMap.put(1, null);

        relationMap.put(2, 1);
        relationMap.put(3, 1);
        relationMap.put(4, 1);

        relationMap.put(5, 2);
        relationMap.put(6, 2);
        relationMap.put(7, 2);

        relationMap.put(8, 3);
        relationMap.put(9, 3);

        relationMap.put(10, 4);

        relationMap.put(11, 6);
        relationMap.put(12, 6);

        relationMap.put(13, 7);

        relationMap.put(14, 8);
        relationMap.put(15, 8);
        relationMap.put(16, 8);
        relationMap.put(17, 8);
        relationMap.put(18, 8);

        relationMap.put(19, 10);
        relationMap.put(20, 10);

        relationMap.put(21, 15);

        relationMap.put(22, 16);

        relationMap.put(23, 22);

        relationMap.put(24, 23);

        userMap.put(1,  new User(1,  "root", "", ""));
        userMap.put(2,  new User(2,  "Two", "two@test.com", "2000"));
        userMap.put(3,  new User(3,  "Three", "three@test.com", "3000"));
        userMap.put(4,  new User(4,  "Four", "four@test.com", "4000"));
        userMap.put(5,  new User(5,  "Five", "", ""));
        userMap.put(6,  new User(6,  "Six", "", ""));
        userMap.put(7,  new User(7,  "Seven", "", ""));
        userMap.put(8,  new User(8,  "Eight", "", ""));
        userMap.put(9,  new User(9,  "Nine", "", ""));
        userMap.put(10, new User(10, "Ten", "", ""));
        userMap.put(11, new User(11, "Eleven", "", ""));
        userMap.put(12, new User(12, "Twelve", "", ""));
        userMap.put(13, new User(13, "Thirteen", "", ""));
        userMap.put(14, new User(14, "Fourteen", "", ""));
        userMap.put(15, new User(15, "Fifteen", "", ""));
        userMap.put(16, new User(16, "Sixteen", "", ""));
        userMap.put(17, new User(17, "SevenTeen", "", ""));
        userMap.put(18, new User(18, "Eighteen", "", ""));
        userMap.put(19, new User(19, "NineTeen", "", ""));
        userMap.put(20, new User(20, "Twenty", "", ""));
        userMap.put(21, new User(21, "Twenty One", "", ""));
        userMap.put(22, new User(22, "Twenty Two", "", ""));
        userMap.put(23, new User(23, "Twenty Three", "", ""));
        userMap.put(24, new User(24, "Twenty Four", "", ""));
    }


    public static Map<Integer, Integer> getRelationMap() {
        return relationMap;
    }

    public static Map<Integer, User> getUserData() {
        return userMap;
    }
}
