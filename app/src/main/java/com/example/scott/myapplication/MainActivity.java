package com.example.scott.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.firebase.client.*;
import User.*;
import android.util.Log;
import java.lang.*;
import java.io.*;
import java.util.*;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main);
        //Log.d("Main Activity", "Hello World!");
        System.out.printf("Hello World\n");
        Firebase ref = new Firebase("https://dazzling-fire-3497.firebaseio.com/");
        Firebase test = ref.child("test");
        Firebase intTest = test.child("intTest");
        //intTest.setValue(3);
        Firebase testUserMap = test.child("testUserMap");
        Map<String, User> users = new HashMap<String, User>();
        User Cris = new User("clewczyk@ucsc.edu", 1234567890);
        User Daniel = new User("blah@ucsc.edu", 1234567890);
        users.put("Cris", Cris);
        users.put("Daniel", Daniel);
        testUserMap.setValue(users);
        testUserMap.child("Cris").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                System.out.println(dataSnapshot.getValue());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });
        Cris.setPhone(1234);
        //users.put("Cris", Cris);
        testUserMap.setValue(users);
    }

}
