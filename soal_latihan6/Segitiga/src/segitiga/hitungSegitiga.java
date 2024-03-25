/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segitiga;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class hitungSegitiga {
    double alas = 0;
    double tinggi = 0;
    double sisi = 0;
    
    hitungSegitiga(double alasBaru, double tinggiBaru, double sisiBaru){
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    double getLuas(){
        return 0.5 * alas * tinggi;
    }
    
    double getKeliling(){
        return alas + (2 * sisi);
    }
    
//    void setAlas(double alasBaru){
//        alas = alasBaru;
//    }
//    
//    void setTinggi(double tinggiBaru){
//        tinggi = tinggiBaru;
//    }
//    
//    void setSisi(double sisiBaru){
//        sisi = sisiBaru;
//    }
}
