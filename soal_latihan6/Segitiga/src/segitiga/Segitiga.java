/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitiga;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        hitungSegitiga segitiga1 = new hitungSegitiga(1, 1, 1);
        
        hitungSegitiga segitiga2 = new hitungSegitiga(30, 10, 90);
        
        hitungSegitiga segitiga3 = new hitungSegitiga(20, 30, 60);
        
        System.out.println("Segitiga 1");
        System.out.println("Luas = " + segitiga1.getLuas());
        System.out.println("Keliling = " + segitiga1.getKeliling());
        
        System.out.println();
        
        System.out.println("Segitiga 2");
        System.out.println("Luas = " + segitiga2.getLuas());
        System.out.println("Keliling = " + segitiga2.getKeliling());
        
        System.out.println();
        
        System.out.println("Segitiga 3 ");
        System.out.println("Luas = " + segitiga3.getLuas());
        System.out.println("Keliling = " + segitiga3.getKeliling());
    }
    
}
