/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arbolavl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author carlareyes
 */
public class MainArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArbolAVL miArbol = new ArbolAVL();
        miArbol.add(0);
        miArbol.add(1);
        miArbol.add(2);
        miArbol.add(3);
        miArbol.add(6);
        miArbol.add(10);
        miArbol.add(-1);
        miArbol.add(11);
        miArbol.remove(10);
        miArbol.remove(6);
        miArbol.remove(2);
        miArbol.imprimirArbolitoNiveles();

    }
    
}

