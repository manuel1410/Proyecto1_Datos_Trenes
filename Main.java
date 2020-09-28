/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author Andrey Sancho
 */

import.util.List;
import.util.ArrayList;
import.items; //Aquí pretendo importar el archivo items.java

public class Main {
    public static void main(String[] args){
        System.out.println("welcome to the shop");



        ArrayList<items> listaitemsatq = new ArrayList<items>();

        item item01_atq = new item(50,0,5,0,5);
        item item02_atq = new item(75,0,10,5,0);
        item item03_atq = new item(85,10,25,0,0);
        item item04_atq = new item(100,20,0,0,0);
        item item05_atq = new item(105,0,15,25,5);


        ArrayList<item> listaitemsdef = new ArrayLista<items>();

        item item01_def = new item(0,75,0,0,5);
        item item02_def = new item(0,100,0,0,10);
        item item03_def = new item(0,105,0,25,0);
        item item04_def = new item(0,125,0,0,40);
        item item05_def = new item(0,85,0,25,50);
        
    }
    
}
