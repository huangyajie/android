package com.example.mac.sendargs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AnotherActivity extends Activity {

    private TextView tv;
    private EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent i = getIntent();
//        Bundle b = i.getExtras();
//        Bundle b = i.getBundleExtra("data");
        tv = (TextView)findViewById(R.id.tv);
        ed = (EditText)findViewById(R.id.editText);
//        tv.setText(i.getStringExtra("data"));
//        tv.setText(String.format("name=%s, age=%d,addr=%s",b.getString("name"),b.getInt("age"),b.getString("addr", "zhengzhou")));
        User u = (User)i.getSerializableExtra("user");

        tv.setText(String.format("user info(name = %s,age = %d)",u.getName(),u.getAge()));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();
                i.putExtra("data",ed.getText().toString());
                setResult(1,i);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_another, menu);
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
}
