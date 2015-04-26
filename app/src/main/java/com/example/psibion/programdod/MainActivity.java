package com.example.psibion.programdod;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements
        OverviewFragment.OverviewFragmentActivityListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ta metoda pochodzi z OverviewFragmentActivityListener
    @Override
    public void onItemSelected(String msg) {
        DetailFragment fragment = (DetailFragment) getFragmentManager()
                .findFragmentById(R.id.detailFragment);

        // sprawdzamy czy fragment istnieje w tej aktywności
        if (fragment != null && fragment.isInLayout()) {
            // ustawiamy teskt we fragmencie
            fragment.setText(msg);
        }
    }
}
