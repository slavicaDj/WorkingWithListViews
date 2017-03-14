package com.example.hpkorisnik.workingwithlistviews;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView ;
    private static ArrayList<Person> persons = new ArrayList<>();
    static {
        persons.add(new Person("Slavica","Djukic","ETF","always late...",25));
        persons.add(new Person("Filip","","ETF","",27));
        persons.add(new Person("Mirjana","","ETF","",22));
        persons.add(new Person("Bane","","PMF","",25));
        persons.add(new Person("Suzana","Savic","PMF","",25));
        persons.add(new Person("Boris","Kuburic","FPN","",25));
        persons.add(new Person("Slavisa","Mirkovic","PMF","",25));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        ArrayList<String> names = getPersonsNames();
        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, names);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item value
                String  itemValue  = (String) listView.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("firstName",itemValue);
                startActivity(intent);
            }

        });
    }

    public static Person getPersonFromName(String name) {
        for (Person p : persons) {
            if (p.getFirstName().equals(name))
                return p;
        }
        return null;
    }

    private static ArrayList<String> getPersonsNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Person p : persons) {
            names.add(p.getFirstName());
        }
        return names;
    }

}
