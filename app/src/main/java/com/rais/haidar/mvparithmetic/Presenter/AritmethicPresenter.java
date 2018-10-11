package com.rais.haidar.mvparithmetic.Presenter;

import com.rais.haidar.mvparithmetic.Base.BasePresenter;
import com.rais.haidar.mvparithmetic.View.LoginView;

/**
 * Created by Hoidar on 10/11/18.
 */

public class AritmethicPresenter implements BasePresenter<LoginView> {

    LoginView loginView;

    public void tambah(String bil1, String bil2){

        Double bilangan1 = Double.parseDouble(bil1);
        Double bilangan2 = Double.parseDouble(bil2);
        double hasil = bilangan1 + bilangan2;
        loginView.onSuccess(String.valueOf(hasil));
    }

    public void kurang(String bil1,String bil2){
        Double bilangan1 = Double.parseDouble(bil1);
        Double bilangan2 = Double.parseDouble(bil2);
        double hasil = bilangan1 - bilangan2;
        loginView.onSuccess(String.valueOf(hasil));
    }

    public void kali(String bil1,String bil2){
        Double bilangan1 = Double.parseDouble(bil1);
        Double bilangan2 = Double.parseDouble(bil2);
        double hasil = bilangan1 * bilangan2;
        loginView.onSuccess(String.valueOf(hasil));

    }

    public void bagi(String bil1,String bil2){
        Double bilangan1 = Double.parseDouble(bil1);
        Double bilangan2 = Double.parseDouble(bil2);
        double hasil = bilangan1 / bilangan2;
        loginView.onSuccess(String.valueOf(hasil));
    }

    public void clear(String bil1,String bil2){
        bil1 = "";
        bil2 = "";
    }



    @Override
    public void onAttach(LoginView v) {

        loginView = v;

    }
}
