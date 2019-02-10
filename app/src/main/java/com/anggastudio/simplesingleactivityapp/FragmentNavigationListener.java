package com.anggastudio.simplesingleactivityapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public interface FragmentNavigationListener {
    void openFragment1(Bundle bundle);
    void openFragment2(Bundle bundle);
    void openFragment(Fragment fragment);
}
