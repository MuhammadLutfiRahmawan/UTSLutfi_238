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
public class Komputer {
    private CPU cpu;
    public Komputer(CPU cpu){
        this.cpu = cpu;
    }
    public Komputer(){
    }
    public void memasang(CPU cpu){
        System.out.println("CPU: "+cpu.getCPUDAta()+" dipasang");
    }
    public void melepas(CPU cpu){
        System.out.println("CPU: "+cpu.getCPUDAta()+" dilepas");
    }
    public void cetakInfo(){
        System.out.println("Spesifikasi: CPU: "+this.cpu.getCPUDAta());
    }   
}
