package com.anggastudio.simplesingleactivityapp.childfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anggastudio.simplesingleactivityapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLima extends Fragment {


    public FragmentLima() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_lima, container, false);
    }

}
