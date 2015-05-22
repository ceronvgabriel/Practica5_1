package ceron.gabriel.prctica_5;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_marinilla, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        FragmentManager fragmentManager =getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (id == R.id.action_hoteles) {
            Hoteles fragment = new Hoteles();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }

        if (id == R.id.action_bares) {
            Bares fragment = new Bares();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }

        if (id == R.id.action_turismo) {
            Turistico fragment = new Turistico();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }

        if (id == R.id.action_demografia) {
            Demografia fragment = new Demografia();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }

        if (id == R.id.action_acerca) {
            AcercaDe fragment = new AcercaDe();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }


        return super.onOptionsItemSelected(item);
    }
}
