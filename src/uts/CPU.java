/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author laptop
 */
public class CPU {
    protected String nama;
    protected int kecepatan;
    
    public CPU(String nama,int kecepatan){
       this.nama=nama;
       this.kecepatan=kecepatan;
    }
    public String getCPUDAta(){
        return(this.nama+" "+this.kecepatan+" GHZ");
    }
}
