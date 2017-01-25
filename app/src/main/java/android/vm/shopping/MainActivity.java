package android.vm.shopping;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Alessio-Valeria on 25/01/2017.
 */

public class MainActivity extends Activity {

    TextView welcomeTv;
    Button changeTextBtn;
    EditText insertText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeTv = (TextView) findViewById(R.id.welcome_tv);
        changeTextBtn = (Button) findViewById(R.id.change_Text_Btn);
        insertText = (EditText) findViewById(R.id.edit_text_01)
        changeTextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                welcomeTv.setText(insertText.getText());
            }
        });

    }
}
