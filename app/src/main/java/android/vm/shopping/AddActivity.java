package android.vm.shopping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.firebase.*;
import com.google.firebase.FirebaseApp;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class AddActivity extends AppCompatActivity {

    private Button addButton;
    private EditText nameText;
    private EditText priceText;
    private Firebase myRoot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        

        myRoot = new Firebase("https://shopping-66239.firebaseio.com/");

    }
}
