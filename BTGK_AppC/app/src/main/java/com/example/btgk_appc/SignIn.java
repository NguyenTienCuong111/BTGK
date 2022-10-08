package com.example.btgk_appc;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SignIn extends AppCompatActivity {
    EditText edtuser, edtpassword;
    Button btndangnhap, btnsignup;
    String ten, mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);



        Anhxa();
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
        btnsignup = (Button) findViewById(R.id.buttonsignup);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length() != 0 && edtpassword.getText().length() != 0) {
                    if (edtuser.getText().toString().equals(ten) && edtpassword.getText().toString().equals(mk)) {
                        Toast.makeText(SignIn.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(SignIn.this, MainActivity.class);
                        startActivity(intent);
                    } else if (edtuser.getText().toString().equals("cuong712") && edtpassword.getText().toString().equals("71202")) {
                        Toast.makeText(SignIn.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(SignIn.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(SignIn.this, "Bạn đã đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(SignIn.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(SignIn.this);
                dialog.setTitle("Hộp thoại sử lý");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.activity_sign_up);

                EditText edttk = (EditText)dialog.findViewById(R.id.edttk);
                EditText edtmk = (EditText)dialog.findViewById(R.id.edtmk);
                Button btndk = (Button)dialog.findViewById(R.id.btn_dk);
                Button btnhuy = (Button)dialog.findViewById(R.id.btn_huy);
                btndk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edttk.getText().toString().trim();
                        mk = edtmk.getText().toString().trim();

                        edtuser.setText(ten);
                        edtpassword.setText(mk);

                        dialog.cancel();
                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

    }


    private void Anhxa() {
        edtuser = (EditText) findViewById(R.id.edittextuser);
        edtpassword = (EditText) findViewById(R.id.edittextpassword);
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
        btnsignup = (Button) findViewById(R.id.buttonsignup);


    }
}