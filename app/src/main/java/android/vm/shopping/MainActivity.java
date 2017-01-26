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


    Button changeTextBtn;
    EditText insertText;
    MainActivity activity = this;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTextBtn = (Button) findViewById(R.id.button01);
        insertText = (EditText) findViewById(R.id.search_bar);
        changeTextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                username = insertText.getText().toString();
                Intent intent = new Intent(activity,SecondActivity.class);
                intent.putExtra("useraname" , username);
                intent.putExtra("age" , 18);
                startActivity(intent);
            }
        });

    }
}
