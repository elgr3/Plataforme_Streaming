/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.LoginModel;
import vue.LoginVue;

/**
 *
 * @author rody
 */
public class controllerLogin implements ActionListener {
    
    private LoginVue loginV;
    private LoginModel model;
    
    
    public controllerLogin (LoginVue loginV, LoginModel model){
        this.loginV = loginV;
        this.model = model;
        this.loginV.btninscrire.addActionListener(this);  
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        model.setEmail(loginV.txtemail.getText());
        model.setRib(loginV.txtrib.getText());
        model.setDate_naiss(loginV.txtdate_naiss.getText());
        System.out.println("test");
        JOptionPane.showMessageDialog(null, "Bienvenue " +model.getEmail()+ "avec le rib : " +model.getRib()+ "nee le "+ model.getDate_naiss());
        
    }
    
}
