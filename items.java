package com.mycompany.tienda;

import.util.List;
import.util.ArrayList;


public class items{     //Estos son los atributos de la clase
    private int atq;
    private int def;
    private int hp;
    private int luk;
    private int vel;


    /*
    La idea es que todos los items tengan todos los stats pero en caso de que no se ocupen,
    se les pone 0. 

    Por ejemplo un item de atq tendría def 0.
    */


    public item(int atq, int def, int hp, int lck, int vel){ //aquí va el constructor

        super();

        this.atq = atq;
        this.def = def;
        this.hp = hp;
        this.luk = lck;
        this.vel = vel;

    }
    
    //item item1 = new item(50,0,5,0,0);




}
