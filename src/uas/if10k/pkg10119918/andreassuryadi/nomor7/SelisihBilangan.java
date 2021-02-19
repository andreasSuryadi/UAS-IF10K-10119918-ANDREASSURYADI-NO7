/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if10k.pkg10119918.andreassuryadi.nomor7;

/**
 *
 * @author andreas
 */
public class SelisihBilangan extends Bilangan {
    public void selisihBilangan() {
        int selisih = this.getNilai1() - this.getNilai2();
        
        System.out.println("Hasil Pengurangan = " + selisih);
    }
}
