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
public class futbolcu extends sporcu {
 boolean kartKullanildiMi=false;
  public  String futbolcuAdi, futbolcuTakim; int penaltı, serbestAtis,kaleciKarsiKarsiya;
    public futbolcu() {

    }

    public futbolcu(String sporcuIsim, String sporcuTakim, int penaltı,int serbestAtis,int kaleciKarsiKarsiya) {
        super();
        this.futbolcuAdi = sporcuIsim;
        this.futbolcuTakim = sporcuTakim;
        this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
        this.serbestAtis=serbestAtis;
        this.penaltı=penaltı;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public int getPenaltı() {
        return penaltı;
    }

    public void setPenaltı(int penaltı) {
        this.penaltı = penaltı;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public String getFutbolcuAdi() {
        return futbolcuAdi;
    }

    public void setFutbolcuAdi(String futbolcuAdi) {
        this.futbolcuAdi = futbolcuAdi;
    }

    public String getFutbolcuTakim() {
        return futbolcuTakim;
    }

    public void setFutbolcuTakim(String futbolcuTakim) {
        this.futbolcuTakim = futbolcuTakim;
    }

    @Override
    public int sporcuPuaniGoster(){
        return 0;
    
    }
}
