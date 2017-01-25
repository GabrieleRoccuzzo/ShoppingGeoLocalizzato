package android.vm.shopping;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    TextView text01;
    Intent intent;
    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text01 = (TextView)findViewById(R.id.text_01);
        intent = getIntent();
        username = intent.getStringExtra("username");
        text01.setText(username);
    }
}
