package com.example.theeliterides;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.theeliterides.register.RegisterActivity;
import com.example.theeliterides.tab.AllFragment;
import com.example.theeliterides.tab.SaloonFragment;
import com.example.theeliterides.tab.SuvFragment;
import com.example.theeliterides.tab.TabAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener,
        AllFragment.OnFragmentInteractionListener,
        SuvFragment.OnFragmentInteractionListener,
        SaloonFragment.OnFragmentInteractionListener
{
    private Toolbar toolbarr;
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private AllFragment mTab1;
    private SaloonFragment mTab2;
    private SuvFragment mTab3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        toolbarr = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbarr);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        mTab1 = new AllFragment();
        mTab2= new SaloonFragment();
        mTab3 = new SuvFragment();


        tabLayout.setupWithViewPager(viewPager);

        TabAdapter mVP = new TabAdapter(getSupportFragmentManager(),0);

        mVP.addFragment(mTab1, "All");
        mVP.addFragment(mTab2, "Saloon");
        mVP.addFragment(mTab3, "Suv ");
        viewPager.setAdapter(mVP);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_car);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_car);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_car);

    }




















    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
        if (id==R.id.register){
            Intent i = new Intent(this, RegisterActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
