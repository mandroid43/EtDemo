package com.manapps.mandroid.etdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button btn_register;
    TextInputLayout firstNameTextField;
    TextInputLayout lastNameTextField;
    TextInputLayout addressTextField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_register=findViewById(R.id.btn_register);
        firstNameTextField=findViewById(R.id.firstNameTextField);
        lastNameTextField=findViewById(R.id.lastNameTextField);
        addressTextField=findViewById(R.id.addressTextField);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName=  firstNameTextField.getEditText().getText().toString();
                if (firstName.isEmpty()){
                    firstNameTextField.setError("Enter First Name");
                }else {
                    firstNameTextField.setError(null);
                }
                String lastName=  lastNameTextField.getEditText().getText().toString();
                if (lastName.isEmpty()){
                    lastNameTextField.setError("Enter Last Name");
                }else {
                    lastNameTextField.setError(null);
                }
                String address=  addressTextField.getEditText().getText().toString();
                if (address.isEmpty()){
                    addressTextField.setError("Enter Address");
                }else {
                    addressTextField.setError(null);
                }
            }
        });

        firstNameTextField.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String firstName=  firstNameTextField.getEditText().getText().toString();
                if (firstName.isEmpty()){
                    firstNameTextField.setError("Enter First Name");
                }else {
                    firstNameTextField.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        lastNameTextField.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String lastName=  lastNameTextField.getEditText().getText().toString();
                if (lastName.isEmpty()){
                    lastNameTextField.setError("Enter Last Name");
                }else {
                    lastNameTextField.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        addressTextField.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String address=  addressTextField.getEditText().getText().toString();
                if (address.isEmpty()){
                    addressTextField.setError("Enter Address");
                }else {
                    addressTextField.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });










    }
}