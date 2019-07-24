package com.rsmartin.viewmodeludemy.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rsmartin.viewmodeludemy.util.User;

public class DBLDViewModel extends ViewModel {

    private MutableLiveData<User> user;
    private MutableLiveData<Boolean> visible;
    private MutableLiveData<Float> size;

    public DBLDViewModel() {
        user = new MutableLiveData<>();
        visible = new MutableLiveData<>();
        size = new MutableLiveData<>();
        visible.setValue(true);
        size.setValue(14f);
    }

    public LiveData<User> getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user.setValue(user);
    }

    public void updateUser(){
        User user2 = new User("Laura", "23");
        this.user.setValue(user2);
    }

    public LiveData<Boolean> getVisible(){
        return visible;
    }

    public void setVisible(Boolean visible){
        this.visible.setValue(visible);
    }

    public void changeVisibility(){
        if(visible.getValue().booleanValue()){
            visible.setValue(false);
        } else {
            visible.setValue(true);
        }

        size.setValue(size.getValue().floatValue()+5f);
    }

    public LiveData<Float> getSize() {
        return size;
    }

    public void setSize(MutableLiveData<Float> size) {
        this.size = size;
    }
}
