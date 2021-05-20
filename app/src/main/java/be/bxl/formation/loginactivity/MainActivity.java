package be.bxl.formation.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private Button btnLogin, btnReset;
    private TextView appNameText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText)findViewById(R.id.et_main_username);
        etPassword = (EditText)findViewById(R.id.et_main_password);
        btnLogin = (Button)findViewById(R.id.btn_main_login);
        btnReset = (Button)findViewById(R.id.btn_main_reset);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                String messageToast;
                if (username.equals("User") && password.equals("1234")){
                    messageToast = String.format(getString(R.string.toast_login_welcome), username);
                }else{
                    messageToast = "Bad credentials";
                }
                Toast.makeText(getApplicationContext(), messageToast, Toast.LENGTH_LONG).show();
            }
        });

        btnReset.setOnClickListener(v -> {
            etUsername.setText("");
            etPassword.setText("");
        });

    }
}