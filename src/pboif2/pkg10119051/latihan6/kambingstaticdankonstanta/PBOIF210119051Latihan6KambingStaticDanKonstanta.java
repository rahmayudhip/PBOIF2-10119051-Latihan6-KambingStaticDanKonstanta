/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan6.kambingstaticdankonstanta;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program untuk menampilkan jumlah Kambing
 */

public class PBOIF210119051Latihan6KambingStaticDanKonstanta {

    /**
     * @param args the command line arguments
     */
    public static final String NAMA_KAMBING = "SOLIHIN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak" + Mamalia. jumlahKambing);
    }
    
}
