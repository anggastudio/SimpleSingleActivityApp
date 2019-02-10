package com.anggastudio.simplesingleactivityapp.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.anggastudio.simplesingleactivityapp.FragmentNavigationListener;
import com.anggastudio.simplesingleactivityapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDua extends Fragment implements View.OnClickListener {


    private FragmentNavigationListener navigationListener;
    private String message;

    public FragmentDua() {
        // Required empty public constructor
    }

    public void setNavigationListener(FragmentNavigationListener navigationListener) {
        this.navigationListener = navigationListener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_dua, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tvMessage = view.findViewById(R.id.tv_message);
        Button buttonFragment3 = view.findViewById(R.id.button_fragment_3);
        buttonFragment3.setOnClickListener(this);
        getDataBundle();
        setMessage(tvMessage);
    }

    private void setMessage(TextView tvMessage) {
        if (message != null && !message.isEmpty()) {
            tvMessage.setText(message);
        }
    }

    private void getDataBundle() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            message = bundle.getString("data");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_fragment_3:
                openFragment3();
                break;
            default:
                break;
        }
    }

    private void openFragment3() {
        String param1 = "Judul Buat Child 1";
        String param2 = "Judul Buat Child 2";
        Bundle bundle = new Bundle();
        bundle.putString("param1", param1);
        bundle.putString("param2", param2);
        FragmentTiga fragmentTiga = new FragmentTiga();
        fragmentTiga.setArguments(bundle);
        navigationListener.openFragment(fragmentTiga);
    }
}
