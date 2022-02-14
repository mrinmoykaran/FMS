package com.a5h.fms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    EditText txtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.black, this.getTheme()));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.black));
        }
        txtInput=findViewById(R.id.txtInput);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            txtInput.setShowSoftInputOnFocus(false);
        } else {
            txtInput.setTextIsSelectable(true);
            //N.B. Accepting the case when non editable text will be selectable
        }

    }

    public void enterA(View view) {
        int start =txtInput.getSelectionStart();
        String s = "A";
        txtInput.getText().insert(start, s);

    }

    public void enterB(View view) {
        int start =txtInput.getSelectionStart();
        String s = "B";
        txtInput.getText().insert(start, s);
    }
    public void enterC(View view) {
        int start =txtInput.getSelectionStart();
        String s = "C";
        txtInput.getText().insert(start, s);
    }
    public void enterD(View view) {
        int start =txtInput.getSelectionStart();
        String s = "D";
        txtInput.getText().insert(start, s);
    }
    public void enterE(View view) {
        int start =txtInput.getSelectionStart();
        String s = "E";
        txtInput.getText().insert(start, s);
    }
    public void enterF(View view) {
        int start =txtInput.getSelectionStart();
        String s = "F";
        txtInput.getText().insert(start, s);
    }

    public void Del(View view)
    {
        int cursorPosition = txtInput.getSelectionStart();
        if (cursorPosition > 0) {
            txtInput.setText(txtInput.getText().delete(cursorPosition - 1, cursorPosition));
            txtInput.setSelection(cursorPosition-1);
        }
    }

    public void clearScreen(View view) {
        txtInput.setText("");
    }

    public void openProfile(View view)
    {
        startActivity(new Intent(this,Profile.class));
    }
}