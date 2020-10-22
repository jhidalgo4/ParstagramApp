package edu.utep.joaquin.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class LoginActivity extends AppCompatActivity {

    private Button login, signup;
    private EditText username, password;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = this;

        login = findViewById(R.id.btnLogin);
        signup = findViewById(R.id.btnSignUp);

        username = findViewById(R.id.userNameText);
        password = findViewById(R.id.passwordText);

        //Keep signed in
        if( ParseUser.getCurrentUser() != null){
            goMainActivity();
        }

        //LOGIN
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser(username.getText().toString() , password.getText().toString() );
                Log.d("abc123", "Login clicked!!");

            }
        });

        //SIGN-UP
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(LoginActivity.this, "SIGN-UP CLICKED", Toast.LENGTH_SHORT).show();
                signupUser(username.getText().toString() , password.getText().toString());
                Log.d("abc123", "Sign-up clicked!!");
            }
        });
    }

    private void signupUser(String un, String pw) {
//        ParseUser user = new ParseUser();
//        user.setUsername(un);
//        user.setPassword(pw);
//        user.signUpInBackground(new SignUpCallback() {
//            public void done(ParseException e) {
//                if (e != null) {
//                    Log.e("abc123", "issue with signup ");
//                    Toast.makeText(LoginActivity.this, "signup failed", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                Log.d("abc123", "success! ");
//                goMainActivity();
//                Toast.makeText(LoginActivity.this, "Welcome new user", Toast.LENGTH_SHORT).show();
//            }
//        });
        goMainActivity();
    }

    //Check for username and password and if correct, intent to mainActivity
    public void loginUser(String userName, String password){

//        Log.d("abc123", "attempting to login username: "+userName);
//        Log.d("abc123", "attempting to login password: "+password);
        ParseUser.logInInBackground(userName, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if(e != null){
                    Log.e("abc123", "issue with login ");
                    Toast.makeText(LoginActivity.this, "Wrong, try again", Toast.LENGTH_SHORT).show();
                    return;
                }
                Log.d("abc123", "success! ");
                goMainActivity();
                Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Segue to next activity/view
    private void goMainActivity(){
        Intent i = new Intent(this, MainActivity.class);
        ////                    i.putExtra("title", movie.getTitle() );
        startActivity(i);
        finish();
    }

}