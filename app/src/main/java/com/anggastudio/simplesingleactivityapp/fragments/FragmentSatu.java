package com.anggastudio.simplesingleactivityapp.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.anggastudio.simplesingleactivityapp.FragmentNavigationListener;
import com.anggastudio.simplesingleactivityapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSatu extends Fragment implements View.OnClickListener {


    private FragmentNavigationListener navigationListener;

    public FragmentSatu() {
        // Required empty public constructor
    }

    public void setNavigationListener(FragmentNavigationListener navigationListener){
        this.navigationListener = navigationListener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_satu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.button_fragment_2);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_fragment_2:
                gotoFragmentDua();
                break;
            default:
                break;
        }

    }

    private void gotoFragmentDua() {
        Bundle bundle = new Bundle();
        bundle.putString("data", "ini dipanggil dari fragment 1");
        navigationListener.openFragment2(bundle);
    }
}
