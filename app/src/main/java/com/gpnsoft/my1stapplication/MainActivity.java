package com.gpnsoft.my1stapplication;

import android.app.Application;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RadioButton Handler
        RadioGroup rg = (RadioGroup) findViewById(R.id.RG_One);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                TextView tv = (TextView) findViewById(R.id.TView_Main);
//                Toast toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
                switch (checkedId) {
                    case -1:
                        tv.setText("Вы не нажали ни на что.");
                        Toast.makeText(getApplicationContext(), "U Pressed nothing)))", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.RBut_01:
                        tv.setText("U pressed number 01");
                        Toast.makeText(getApplicationContext(), "U Pressed 01", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.RBut_02:
                        tv.setText("U pressed number 02");
                        Toast.makeText(getApplicationContext(), "U Pressed 02", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.RBut_03:
                        tv.setText("U pressed number 03");
                        Toast.makeText(getApplicationContext(), "U Pressed 03", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.RBut_04:
                        tv.setText("U pressed number 04");
                        Toast.makeText(getApplicationContext(), "U Pressed 04", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case -1:
                // do nothing
                break;
            case R.id.action_exit:
                // Exit Handler
                finish();
                break;
            case R.id.action_settings:
                // Settings Handler
                return true;
            default:
                break;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
        }

        return super.onOptionsItemSelected(item);
    }
}
