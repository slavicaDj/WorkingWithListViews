package com.example.hpkorisnik.workingwithlistviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    TextView textViewTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.textView);
        textViewTitle = (TextView) findViewById(R.id.textViewTitle);

        Person person = MainActivity.getPersonFromName(getIntent().getExtras().getString("firstName"));
        textViewTitle.setText(person.getFirstName() + "'s profile");
        textView.setText("First name: " + person.getFirstName() + "\n" +
                         "Last name: " + person.getLastName() + "\n" +
                         "Age: " + person.getAge() + "\n" +
                         "Faculty: " + person.getFaculty() + "\n" +
                         "About: " + person.getAbout());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
