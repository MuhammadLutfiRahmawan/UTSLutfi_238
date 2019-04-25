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
public class Utama {
    public static void main(String[] args) {
        AMD amd1 = new AMD(3);
        Intel intel1 = new Intel(2);
        Komputer komputer1 = new Komputer(intel1);
        komputer1.cetakInfo();
        komputer1.melepas(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo();
    }
}
