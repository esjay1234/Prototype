package com.example.team.prototype;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.Parse;
import com.parse.ParseObject;

import static com.parse.Parse.*;


public class Login extends ActionBarActivity {
//ayudh checking in again
//esjay checking in
    //hellos
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText) findViewById(R.id.editUser);
        password=(EditText) findViewById(R.id.editPass);
//parse changes by ayudh
        // Enable Local Datastore.
        enableLocalDatastore(this);

        initialize(this, "mVtygHVRCgLsDioXizZYb5gnsKxHdPKPABQEpu4u", "13NZ7KiaeKuXV5LBGUIBQN1Tv31XF27aVF6rkIHk");
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickLogin(View V) {
        String usernameString=username.getText().toString();
        String passwordString=password.getText().toString();
    }

    public void onClickRegister(View V) {

    }
}
