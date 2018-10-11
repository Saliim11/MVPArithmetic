package com.rais.haidar.mvparithmetic.Base;

/**
 * Created by Hoidar on 10/11/18.
 */

public interface BasePresenter <T extends BaseView> {
    void onAttach(T v);
}
