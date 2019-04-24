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
        AMD amd1 = new AMD(0);
        Intel intel1 = new Intel(0);
        Komputer komputer1 = new Komputer();
        komputer1.memasang(amd1);
    }
}
