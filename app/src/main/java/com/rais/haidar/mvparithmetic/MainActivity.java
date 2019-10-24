package com.rais.haidar.mvparithmetic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rais.haidar.mvparithmetic.Presenter.AritmethicPresenter;
import com.rais.haidar.mvparithmetic.View.LoginView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements LoginView {


    @InjectView(R.id.EdtBil1)
    EditText EdtBil1;
    @InjectView(R.id.EdtBil2)
    EditText EdtBil2;
    @InjectView(R.id.btnPlus)
    Button btnPlus;
    @InjectView(R.id.btnMinus)
    Button btnMinus;
    @InjectView(R.id.btnKali)
    Button btnKali;
    @InjectView(R.id.btnBagi)
    Button btnBagi;
    @InjectView(R.id.btnClear)
    Button btnClear;
    @InjectView(R.id.txtHasil)
    TextView txtHasil;


    private AritmethicPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        presenter = new AritmethicPresenter();
        onAttachView();
    }

    @OnClick({R.id.btnPlus, R.id.btnMinus, R.id.btnKali, R.id.btnBagi, R.id.btnClear})
    public void onViewClicked(View view) {
        String Bilangan1 = EdtBil1.getText().toString();
        String Bilangan2 = EdtBil2.getText().toString();

        switch (view.getId()) {
            case R.id.btnPlus:
                presenter.tambah(EdtBil1.getText().toString(), EdtBil2.getText().toString());
                break;
            case R.id.btnMinus:
                presenter.kurang(EdtBil1.getText().toString(), EdtBil2.getText().toString());
                break;
            case R.id.btnKali:
                presenter.kali(EdtBil1.getText().toString(), EdtBil2.getText().toString());
                break;
            case R.id.btnBagi:
                presenter.bagi(EdtBil1.getText().toString(), EdtBil2.getText().toString());
                break;
            case R.id.btnClear:
                EdtBil1.setText("");
                EdtBil2.setText("");
                break;
        }
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
    }

    @Override
    public void onError(String msg) {
        //when error
    }

    // Hello
    @Override
    public void onSuccess(String muncul) {
        txtHasil.setText(muncul);
    }

}
