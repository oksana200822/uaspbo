/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uaspbo;

/**
 *
 * @author ELSANDE
 */
public class Cat extends Animal implements Pet{
    private String  catName;
    public Cat()
    {
        this("");
    }
    public cat(String name)
    {
        super(4);
        catName=name;
    }
    
    public void eat(){
        System.out.println("Cat eat fishes");
    }
    
    public String getName(){
        return catName;
    }
    
    public void setName(String name){
        catName=name;
    }
    
    public void play(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}