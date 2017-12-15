package com.example.didier.exam.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.didier.exam.R;
import com.example.didier.exam.manager.UserManager;

public class FirstActivity extends AppCompatActivity
{
    private EditText registrationInputFirstname,
            registrationInputLastname,
            registrationInputEmail;
    private Button registrationBtnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        registrationInputFirstname = (EditText)findViewById(R.id.input_firstname);
        registrationInputLastname = (EditText)findViewById(R.id.input_lastname);
        registrationInputEmail = (EditText)findViewById(R.id.input_mail);

        registrationBtnSubmit = (Button)findViewById(R.id.btn_submit_user);

        registrationBtnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                registration(
                        registrationInputLastname.getText().toString(),
                        registrationInputFirstname.getText().toString(),
                        registrationInputEmail.getText().toString()
                );
            }
        });
    }

    /**
     * Registration UserManager
     *
     * @param lastname String
     * @param firstname String
     * @param email String
     */
    private void registration(final String lastname, final String firstname, final String email)
    {
        UserManager UserStrategy = new UserManager();

        if (UserStrategy.register(lastname, firstname, email)) {
            Log.d("success", "New user has been created");
            Log.d("success", "Lastname : " + lastname);
            Log.d("success", "Firstname : " + firstname);
            Log.d("success", "Email : " + email);

            return;
        }

        Log.d("error", lastname);
    }
}
