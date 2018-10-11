package com.rais.haidar.mvparithmetic.View;

import com.rais.haidar.mvparithmetic.Base.BaseView;

/**
 * Created by Hoidar on 10/11/18.
 */

public interface LoginView extends BaseView {
    void onError(String msg);

    void onSuccess(String muncul);

}
