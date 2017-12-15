package com.example.didier.exam.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.didier.exam.R;
import com.example.didier.exam.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThirdActivity extends AppCompatActivity
{
    ListView listView;
    ListView listViewSimpleAdapter;

    private String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
            "Yann", "Zoé"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        listView = (ListView)findViewById(R.id.listView);
        listViewSimpleAdapter = (ListView)findViewById(R.id.listView2);

        User u1 = new User("Did", "Youn", "did@gmail.com", "02/03/1995");
        User u2 = new User("Antoine", "Renault", "antoine@gmail.com", "02/03/1995");
        User u3 = new User("Marc", "Intha", "marc@gmail.com", "02/03/1995");

        List<HashMap<String, String>> userList = new ArrayList<>();

        userList.add(u1.convertUser());
        userList.add(u2.convertUser());
        userList.add(u3.convertUser());

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                userList,
                android.R.layout.simple_list_item_2,
                new String[]{"lastname", "firstname", "email"},
                new int[]{android.R.id.text1, android.R.id.text2}
        );
        listViewSimpleAdapter.setAdapter(adapter);

        final ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(ThirdActivity.this,
                android.R.layout.simple_list_item_1, prenoms);
        listView.setAdapter(adapter2);
    }
}
