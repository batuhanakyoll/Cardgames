/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartoyunu;

import java.util.Random;

/**
 *
 * @author aybuk
 */
public class bilgisayar extends oyuncu {

    public static String kartListesif[][] = new String[8][5];
    public static String kartListesib[][] = new String[8][5];
    public static String kartListesifb[][] = new String[8][5];
    public static String kartListesibb[][] = new String[8][5];

    public String[][] getKartListesif() {
        return kartListesif;
    }

    public void setKartListesif(String[][] kartListesif) {
        this.kartListesif = kartListesif;
    }

    public String[][] getKartListesib() {
        return kartListesib;
    }

    public void setKartListesib(String[][] kartListesib) {
        this.kartListesib = kartListesib;
    }

    public bilgisayar() {

    }

    public bilgisayar(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);

    }

    int kartSecb(oyuncu oyuncu) {
        Random random = new Random();
        int randomKart = 5; // ilk 3 indexten farklı olması için rastgele sayı verdim.

        while (true) {

            int temp = random.nextInt(8);

            for (int i = 0; i < 4; i++) {
                if (String.valueOf(temp).equals(oyuncu.kartListesibb[i][0])) {
                    randomKart = i;
                 
                    break;
                }
            }
            if (randomKart != 5) {
                return randomKart;
            }
        }

    }

    int kartSecf(oyuncu oyuncu) {
        Random random = new Random();
        int randomKart = 5; // ilk 3 indexten farklı olması için rastgele sayı verdim.
      
        while (true) {
            int temp = random.nextInt(8);

            for (int i = 0; i < 4; i++) {
                if (String.valueOf(temp).equals(oyuncu.kartListesifb[i][0])) {
                    randomKart = i;
                 
                    break;
                }
            }

            if (randomKart != 5) {
                return randomKart;
            }
            
        }
       
    }
}
