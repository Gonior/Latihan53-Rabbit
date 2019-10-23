/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan53.rabbit;

/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan kelinci konsep pewarisan class
 */
public class PBO11K10118901Latihan53Rabbit {

    public static void main(String[] args) {
        Rabbit kelinci = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is "+kelinci.getName());
        System.out.println(kelinci.getName()+" is Vegetarian? "+kelinci.isVegetarian());
        System.out.println(kelinci.getName()+" eats "+kelinci.getEats());
        System.out.println(kelinci.getName()+" has "+kelinci.getnoOfLegs()+" legs.");
        System.out.println(kelinci.getName()+" color is "+ kelinci.getColor());
    }
    
}
