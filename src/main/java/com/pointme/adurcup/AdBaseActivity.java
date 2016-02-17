package com.pointme.adurcup;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by piyush_000 on 2/8/2016.
 */
public class AdBaseActivity extends AppCompatActivity {
    android.support.v7.app.ActionBar actionBar;
    private int layoutResID;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutResID);

        actionBar = getSupportActionBar();

    }

    protected void hasParent(boolean b) {
        if (b) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        this.layoutResID = layoutResID;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
        if (item.getItemId() == android.R.id.home)
            finish();
    }
}
