package com.kardelenapp.matematikformulleri;

/**
 * Created by mustafa on 11/14/2017.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MerkeziEgilimFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.merkezi_egilim, null);
        return v;
    }
}