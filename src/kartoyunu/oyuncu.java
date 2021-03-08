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
public abstract class oyuncu {
  private int oyuncuID;
  private String oyuncuAdi;
  private  int Skor;
      public static String kartListesif[][] = new String[8][5];
   public static String kartListesib[][] = new String[8][5];
   public static String kartListesifb[][] = new String[8][5];
   public static String kartListesibb[][] = new String[8][5];
 public oyuncu() {
      
    }

    public oyuncu(int oyuncuID, String oyuncuAdi,int Skor) {
        this.oyuncuID =oyuncuID;
        this.oyuncuAdi =  oyuncuAdi;
        this.Skor=Skor;
    }
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
public int SkorGoster(){
        return 0;
    
    }
    
 abstract int kartSecf(oyuncu oyuncu);
    abstract int kartSecb(oyuncu oyuncu);
}
