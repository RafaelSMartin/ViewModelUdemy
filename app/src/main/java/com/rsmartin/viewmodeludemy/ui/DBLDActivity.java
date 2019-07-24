package com.rsmartin.viewmodeludemy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.rsmartin.viewmodeludemy.R;
import com.rsmartin.viewmodeludemy.databinding.ActivityDataBindingBinding;
import com.rsmartin.viewmodeludemy.databinding.ActivityDbldBinding;
import com.rsmartin.viewmodeludemy.util.User;
import com.rsmartin.viewmodeludemy.viewmodel.DBLDViewModel;

public class DBLDActivity extends AppCompatActivity {

    private DBLDViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDbldBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dbld);

        binding.setLifecycleOwner(this);
        viewModel = ViewModelProviders.of(this).get(DBLDViewModel.class);
        binding.setViewModel(viewModel);

        User user = new User("Alberto", "30");
        viewModel.setUser(user);

    }
}
