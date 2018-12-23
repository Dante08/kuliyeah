/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author hachi
 */
public class Polimorphism {
    public static void main(String[] args) {
        Penyanyi p ;
        PenyanyiJazz bell = new PenyanyiJazz();
        p = bell ; 
        p.bernyanyi(); 
        
        overload data;
        karakter ka = new karakter();
        integer i = new integer();
        koma k = new koma();
        i.tampilkarakter(12+12);
        k.tampilkarakter((float) 12.2);
   
}
}
