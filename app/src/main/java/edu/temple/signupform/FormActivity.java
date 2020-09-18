package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText userName = findViewById(R.id.username);
                EditText pass = findViewById(R.id.password);
                EditText confirmPass = findViewById(R.id.confirmPassword);
                EditText emailAdd = findViewById(R.id.emailAddress);

                String user = userName.getText().toString();
                String passW = pass.getText().toString();
                String cpass = confirmPass.getText().toString();
                String email = emailAdd.getText().toString();


                if((user.isEmpty() || email.isEmpty() || cpass.isEmpty() || passW.isEmpty()) || (passW.isEmpty() && !cpass.isEmpty()) || (!passW.isEmpty() && cpass.isEmpty())){
                    Toast.makeText(FormActivity.this, "Information is missing.",Toast.LENGTH_SHORT).show();
                }
                else if(!cpass.equals(passW)){
                    Toast.makeText(FormActivity.this, "Passwords do not match.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(FormActivity.this, "Success!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}