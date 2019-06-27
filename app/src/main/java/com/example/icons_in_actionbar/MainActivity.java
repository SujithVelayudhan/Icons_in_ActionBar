package com.example.icons_in_actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.barcode_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemID=item.getItemId();

        if (itemID==R.id.camID)
        {
            Toast.makeText(this, "Barcode scan", Toast.LENGTH_SHORT).show();
        }
        if (itemID==R.id.cammID)
        {
            Toast.makeText(this, "Barcode scan", Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }
}
