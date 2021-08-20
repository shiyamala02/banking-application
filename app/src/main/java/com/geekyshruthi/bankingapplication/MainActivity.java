package com.geekyshruthi.bankingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button btnAllUsers,btnAllTransactions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setcontentview(R.layout.activity_main);
        btnAllUsers = findViewById(R.id.all_users);
        btnAllTransactions = findViewById(R.id.all_transactions);

    }

    public void showAllUsers(View view) {
        Intent intent = new Intent(this, UsersList.class);
        startActivity(intent);
    }

    public void showAllTransactions(View view) {
        Intent intent = new Intent(this, TransactionHistory.class);
        startActivity(intent);
    }
}


