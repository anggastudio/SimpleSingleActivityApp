package com.anggastudio.simplesingleactivityapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anggastudio.simplesingleactivityapp.fragments.FragmentDua;
import com.anggastudio.simplesingleactivityapp.fragments.FragmentSatu;

public class MainActivity extends AppCompatActivity implements FragmentNavigationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openFragmentSatu(new Bundle());
    }

    private void openFragmentSatu(Bundle bundle) {
        FragmentSatu fragmentSatu = new FragmentSatu();
        fragmentSatu.setNavigationListener(this);
        fragmentSatu.setArguments(bundle);
        commitFragment(fragmentSatu);
    }

    public void openFragmentDua(Bundle bundle) {
        FragmentDua fragmentDua = new FragmentDua();
        fragmentDua.setNavigationListener(this);
        fragmentDua.setArguments(bundle);
        commitFragment(fragmentDua);
    }

    private void commitFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void openFragment1(Bundle bundle) {
        openFragmentSatu(bundle);
    }

    @Override
    public void openFragment2(Bundle bundle) {
        openFragmentDua(bundle);
    }

    @Override
    public void openFragment(Fragment fragment) {
        commitFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
