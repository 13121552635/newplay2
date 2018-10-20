package com.example.newplay.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newplay.R;

public class FirstPageFragment extends LazyFragment {

    protected boolean isPrepared;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_page, container, false);
        isPrepared = true;
        lazyLoad();


        return view;
    }

    @Override
    protected void lazyLoad() {
        if (!isVisible||!isPrepared){


            return;
        }
    }
}
