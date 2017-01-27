package android.vm.shopping;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;


public class SecondActivity extends Activity {

    RecyclerView myrecRecycle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myrecRecycle = (RecyclerView) findViewById(R.id.rec01); //collega l'oggetto recycle all'xml previsto


    }
}
