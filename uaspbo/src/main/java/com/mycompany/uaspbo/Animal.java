/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uaspbo;

/**
 *
 * @author ELSANDE
 */
public abstract class Animal {
    
    protected int legs;
    {
        this.legs=legs;
    }
    
    public void walk()
    {
        System.out.println("This animal walk"+legs+"legs.");
    }
    
    public abstract void eat();
}