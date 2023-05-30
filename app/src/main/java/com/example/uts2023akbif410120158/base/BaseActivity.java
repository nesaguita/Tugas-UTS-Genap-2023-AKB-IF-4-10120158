package com.example.uts2023akbif410120158.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

//10120158, Nerisa Sampa Guita, IF4

public abstract class BaseActivity  extends AppCompatActivity {
    protected Unbinder mUnBinder;
    protected abstract int getLayoutView();
    protected abstract void initComponents(Bundle savedInstanceState);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutView());
        mUnBinder = ButterKnife.bind(this);
        initComponents(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnBinder.unbind();
    }
}
