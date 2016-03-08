package com.example.android.mbankinguserguide.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.mbankinguserguide.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainListActivityFragment extends Fragment {

    public MainListActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_list, container, false);
    }
}
