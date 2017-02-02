package android.vm.shopping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Alessio-Valeria on 25/01/2017.
 */

public class MainActivity extends Activity {


    Button sendButton;
    EditText insertText;
    MainActivity activity = this;
    Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = (Button) findViewById(R.id.button2);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(activity, AddActivity.class);
                startActivity(intent01);
                }
            });

        sendButton = (Button) findViewById(R.id.button01);
        insertText = (EditText) findViewById(R.id.search_bar);
        sendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(activity,SecondActivity.class);
                intent.putExtra("search_value" , insertText.getText().toString());
                startActivity(intent);
            }
        });

    }
}
