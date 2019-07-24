package com.rsmartin.viewmodeludemy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.rsmartin.viewmodeludemy.R;
import com.rsmartin.viewmodeludemy.databinding.ActivityDataBindingBinding;
import com.rsmartin.viewmodeludemy.util.User;

public class DataBindingActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_data_binding);
        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        user = new User("TatDataBinding", "24");

        binding.setUser(user);
    }
}
