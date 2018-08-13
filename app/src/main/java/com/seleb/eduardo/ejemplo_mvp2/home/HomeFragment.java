package com.seleb.eduardo.ejemplo_mvp2.home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seleb.eduardo.ejemplo_mvp2.R;


public class HomeFragment extends Fragment implements HomeContract.View {

    public static HomeFragment newInstance(){
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void setEstaCosa(boolean active) {

    }

    @Override
    public void mostrarEstoOtro(int parametro1, int parametro2) {

    }

    @Override
    public void mostrarEsto() {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setPresenter(@NonNull  HomeContract.Presenter presenter) {

    }
}
