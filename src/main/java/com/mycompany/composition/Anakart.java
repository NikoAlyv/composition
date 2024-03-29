/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition;

/**
 *
 * @author Nihat
 */
public class Anakart {
    private String model;
    private String uretici;
    private int yuva_sayisi;
    private String isletim_sistemi;
    
    //constroctur
    
    public Anakart(String model,String uretici,int yuva_sayisi,String isletim_sistemi){
        this.model = model;
        this.uretici = uretici;
        this.yuva_sayisi = yuva_sayisi;
        this.isletim_sistemi = isletim_sistemi;
        
    }
    public void isletim_sistemi_yenile(String isletim_sistemi){
        
        this.isletim_sistemi = isletim_sistemi;
        System.out.println("Isletim sistemi yenilendi:"+isletim_sistemi);
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the yuva_sayisi
     */
    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    /**
     * @param yuva_sayisi the yuva_sayisi to set
     */
    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    /**
     * @return the isletim_sistemi
     */
    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    /**
     * @param isletim_sistemi the isletim_sistemi to set
     */
    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
    
    
}
