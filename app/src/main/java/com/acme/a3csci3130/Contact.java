package com.acme.a3csci3130;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class Contact implements Serializable {

    public  String uid, number, name, primary, address,  province;

    public Contact() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public Contact(String uid, String num, String name, String pri, String addr, String prov){
        this.uid = uid;
        this.number = num;
        this.name = name;
        this.primary = pri;
        this.address = addr;
        this.province = prov;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();

        result.put("uid", uid);
        result.put("number", number);
        result.put("name", name);
        result.put("primary", primary);
        result.put("address", address);
        result.put("province", province);

        return result;
    }
}