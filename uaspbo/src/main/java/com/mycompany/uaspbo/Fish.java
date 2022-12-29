/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uaspbo;

/**
 *
 * @author ELSANDE
 */
public class Fish extends Animal implements Pet{
    
    public Fish(){
        super(0);
    }
    
    private String fishName;
    
    public void eat(){
        System.out.println("Fish eat plants");
    }
    
    public String getName(){
        return fishName;
    }
    
    public void setName(String name){
        fishName=name;
    }
    
    public void play(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void walk(){
        System.out.println("Fish has no legs.");
    }
}
