/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import lib.User;

/**
 *
 * @author blegoh
 */
public class SettingModel {
    private User user;

    public SettingModel(User user) {
        this.user = user;
    }
    
    public User getUser(){
        return user;
    }
    
}
