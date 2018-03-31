package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by SergeyKulyk on 31.03.2018.
 */

public class NumberClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Open the list of numbers...", Toast.LENGTH_SHORT).show();

    }
}
