/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turtles.shoppingcart.firstproject;

/**
 *
 * @author sarah
 */
public class First {
   private int id;
   private String name;

    @Override
    public String toString() {
        return "First{" + "id=" + id + ", name=" + name + '}';
    }

   
   
    public First(int id, String name) {
        this.id = id;
        this.name = name;
    }
   
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
}
