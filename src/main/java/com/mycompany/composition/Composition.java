/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composition;

/**
 *
 * @author Nihat
 */
public class Composition {

    public static void main(String[] args) {
     
        Resolution resolution = new Resolution(200,400);
        
        Kasa kasa = new Kasa("Shadow Blade", "Shadow","Temperli cam");
        
        Monitor monitor = new Monitor("V5197DE","ASUS","18.5", resolution);
        
        Anakart anakart = new Anakart("B250-PRO","ASUS",10, "WIndows 10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getAnakart().isletim_sistemi_yenile("Window 8");
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
        
    }
}
