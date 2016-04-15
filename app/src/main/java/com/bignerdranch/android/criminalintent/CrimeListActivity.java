package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by eso on 4/14/2016.
 */
public class CrimeListActivity  extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
