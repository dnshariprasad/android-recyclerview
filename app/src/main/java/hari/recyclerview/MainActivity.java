package hari.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

//Step - 1 > Add dependency in gradle file     compile 'com.android.support:recyclerview-v7:23.+'
//Step - 2 >
public class MainActivity extends AppCompatActivity {
    private RecyclerView friends_list;
    //list to store all friends details
    ArrayList<Friend> friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiation
        friends = new ArrayList<>();

        //loading friends details to array list
        friends.add(new Friend("Hari", "O8AM1A0551", "NDK"));
        friends.add(new Friend("Govi", "O8AM1A0522", "NDL"));
        friends.add(new Friend("Kiran", "O8AM1A0529", "KNL"));
        friends.add(new Friend("Pavan", "O8AM1A0557", "NDL"));
        friends.add(new Friend("Kartheek", "O8AM1A0528", "NDK"));
        friends.add(new Friend("Giri", "O8AM1A0519", "NDL"));
        friends.add(new Friend("Sad", "O8AM1A0543", "NDL"));

        //pull views
        friends_list = (RecyclerView) findViewById(R.id.friends_list);


        // Setup layout manager for items
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        // Control orientation of the items
        // also supports LinearLayoutManager.HORIZONTAL
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // Attach layout manager to the RecyclerView
        friends_list.setLayoutManager(layoutManager);

        //create adapter
        FriendsAdapter friendsAdapter=new FriendsAdapter(friends,this);

        friends_list.setAdapter(friendsAdapter);

    }
}
