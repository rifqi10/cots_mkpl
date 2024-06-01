/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hapid.cots;

/**
 *
 * @author denri
 */
public class Driver {
    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        System.out.println("Hasil: " + counter.getValue());
        
        counter.add();
        
        System.out.println("Hasil: " + counter.getValue());
        
        counter.subtract();
        
        System.out.println("Hasil: " + counter.getValue());
        
        counter.addBy(5);
        
        System.out.println("Hasil: " + counter.getValue());
        
        counter.subtractBy(2);
        
        System.out.println("Hasil: " + counter.getValue());
    }

}
