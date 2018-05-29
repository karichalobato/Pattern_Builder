/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cakes;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Principal {
    public static void main(String args[]){}
        
    public Pasteles getPasteles(){
            return new Pasteles.pastelesBuilder("Chocolate", 8)
           .frutas("frambruesa").cobertura("ganas de chocolate").relleno("crema suiza de frambruesas")
            .build();
        }
}

