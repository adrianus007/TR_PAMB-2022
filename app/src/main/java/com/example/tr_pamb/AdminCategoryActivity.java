package com.example.tr_pamb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView lukisan_p, lukisan_b, lukisan_o;
    private ImageView lukisan_abs, lukisan_onep, lukisan_naruto;
    private ImageView lukisan_abs2, lukisan_abs3, lukisan_abs4;
    private Button LogoutBtn, CheckOrderBtn, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrderBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);

        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });


        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);
                finish();
            }
        });


        lukisan_p = (ImageView) findViewById(R.id.lukisan_p);
        lukisan_b = (ImageView) findViewById(R.id.lukisan_b);
        lukisan_o = (ImageView) findViewById(R.id.lukisan_o);

        lukisan_abs = (ImageView) findViewById(R.id.lukisan_abs);
        lukisan_onep = (ImageView) findViewById(R.id.lukisan_onep);
        lukisan_naruto = (ImageView) findViewById(R.id.lukisan_naruto);

        lukisan_abs2 = (ImageView) findViewById(R.id.lukisan_abs2);
        lukisan_abs3 = (ImageView) findViewById(R.id.lukisan_abs3);
        lukisan_abs4 = (ImageView) findViewById(R.id.lukisan_abs4);



        lukisan_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_p");
                startActivity(intent);
            }
        });

        lukisan_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_b");
                startActivity(intent);
            }
        });

        lukisan_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_o");
                startActivity(intent);
            }
        });

        lukisan_abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_abs");
                startActivity(intent);
            }
        });

        lukisan_onep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_onep");
                startActivity(intent);
            }
        });

        lukisan_naruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_naruto");
                startActivity(intent);
            }
        });

        lukisan_abs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_abs2");
                startActivity(intent);
            }
        });

        lukisan_abs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_abs3");
                startActivity(intent);
            }
        });

        lukisan_abs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lukisan_abs4");
                startActivity(intent);
            }
        });
    }
}