package be.bxl.formation.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailEditText,pswEditText;
    private Button loginButton, resetButton;
    private TextView appNameText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = (EditText)findViewById(R.id.emailEditText);
        pswEditText = (EditText)findViewById(R.id.pswEditText);
        loginButton = (Button)findViewById(R.id.loginButton);
        resetButton = (Button)findViewById(R.id.resetButton);

        resetButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                emailEditText.setText("");
                pswEditText.setText("");
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast logged = Toast.makeText(getApplicationContext(), "You are logged!", Toast.LENGTH_LONG);
                logged.show();
            }
        });

    }
}