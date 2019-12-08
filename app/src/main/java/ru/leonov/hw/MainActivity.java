package ru.leonov.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private MaterialButton btnEnter;
    private MaterialButton btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEnterButtonClick();
        initCloseButtonClick();
    }

    private void initView() {
        etName = findViewById(R.id.tiName);

        btnEnter = findViewById(R.id.btnEnter);
        btnExit = findViewById(R.id.btnExit);
    }

    private void initEnterButtonClick() {
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().equals("")) {
                    Snackbar mSnackbar = Snackbar.make(v, "Поля не могут быть пустыми!", Snackbar.LENGTH_INDEFINITE);
                    mSnackbar.setAction("Понятно", snackBarOnClickListener);
                    mSnackbar.show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, NaviDrawerActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initCloseButtonClick() {
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private View.OnClickListener snackBarOnClickListener = new View.OnClickListener() {
        @Override public void onClick(View view) {
                etName.requestFocus();
        }
    };
}