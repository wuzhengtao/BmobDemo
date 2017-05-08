package com.easywork.wuzht.bmobdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.easywork.data.User;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    private EditText mUser, mPassword;
    private Button btnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this, "739b8d43e62ee8509b325746a835ea78");
        mUser = (EditText) findViewById(R.id.Text);
        mPassword = (EditText) findViewById(R.id.passwordText);
        btnUpload = (Button) findViewById(R.id.upload);
        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mUser.getText().toString();
                String password = mPassword.getText().toString();

                User userTable = new User();
                userTable.setPassword(password);
                userTable.setUser(user);

                userTable.save(new SaveListener<String>() {
                    @Override
                    public void done(String objectId, BmobException e) {
                        if(e==null){
                            Toast.makeText(MainActivity.this,"success",Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this,"default",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });


    }

}