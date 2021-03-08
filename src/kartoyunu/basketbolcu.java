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
public class basketbolcu extends sporcu{
  public  String  basketbolcuAdi , basketbolcuTakim;
 private int ikilik, ucluk  ,serbestAtis ;
   private boolean kartKullanildiMi=false;
  public basketbolcu() {

    }

    public basketbolcu(String sporcuIsim, String sporcuTakim,int ikilik,int ucluk,int serbestAtis) {
        super();
        this.basketbolcuAdi = sporcuIsim;
        this.basketbolcuTakim = sporcuTakim;
        this.ikilik=ikilik;
        this.ucluk=ucluk;
        this.serbestAtis=serbestAtis;
        
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public String getbasketbolcuAdi() {
        return basketbolcuAdi;
    }

    public void setbasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi =basketbolcuAdi;
    }

    public String getbasketbolcuTakim() {
        return basketbolcuTakim;
    }

    public void setbasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
    }

    @Override
    public int sporcuPuaniGoster(){
        return 0;
    
    }
}
