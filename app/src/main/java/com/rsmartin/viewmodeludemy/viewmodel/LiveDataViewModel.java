package com.rsmartin.viewmodeludemy.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rsmartin.viewmodeludemy.util.User;

import java.util.ArrayList;
import java.util.List;

public class LiveDataViewModel extends ViewModel {

    // Permite leer y escribir
    private MutableLiveData<List<User>> userlistLiveData;
    private List<User> userList;

    // solo permite leer
    public LiveData<List<User>> getUserList(){
        if(userlistLiveData == null){
            userlistLiveData = new MutableLiveData<>();
            userList = new ArrayList<>();
        }
        return userlistLiveData;
    }

    public void addUser(User user){
        userList.add(user);
        // setValue en el hilo principal de interfaz de usuario
        userlistLiveData.setValue(userList);
    }
}
