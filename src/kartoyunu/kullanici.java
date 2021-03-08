/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartoyunu;

/**
 *
 * @author aybuk
 */
public class kullanici extends oyuncu {
   public static String kartListesif[][] = new String[8][5];
   public static String kartListesib[][] = new String[8][5];
public static String kartListesifb[][] = new String[8][5];
   public static String kartListesibb[][] = new String[8][5];
    public kullanici() {
    }

    public kullanici(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    

    
    public String[][] getKartListesib() {
        return kartListesib;
    }

    
    public void setKartListesib(String[][] kartListesib) {
        this.kartListesib = kartListesib;
    }
    public String[][] getKartListesif() {
        return kartListesif;
    }

    
    public void setKartListesif(String[][] kartListesif) {
        this.kartListesif = kartListesif;
    }

    @Override
    int kartSecf(oyuncu oyuncu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int kartSecb(oyuncu oyuncu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
