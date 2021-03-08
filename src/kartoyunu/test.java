/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartoyunu;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author aybuk
 */
public class test {

    /**
     * @param args the command line arguments
     */
    ArrayList<Integer> kullanılanKartlarfutbol = new ArrayList<>();
    ArrayList<Integer> kullanılanKartlarbasketbol = new ArrayList<>();

    ArrayList<ImageIcon> oyuncuImagesb = new ArrayList<>();
    ArrayList<ImageIcon> oyuncuImagesf = new ArrayList<>();
    ArrayList<futbolcu> futbolcular = new ArrayList<>();
    ArrayList<basketbolcu> basketbolcular = new ArrayList<>();

    /**
     *
     * @return
     */
    public ArrayList<ImageIcon> oyuncufKartOlustur() {
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/messi.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/ronaldo.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/ronaldinho.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/neymar.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/sabri.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/beckham.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/karius.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/muslera.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesf.add(new ImageIcon(new ImageIcon("kartlarf/kapak.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));

        return oyuncuImagesf;

    }

    /**
     *
     * @return
     */
    public ArrayList<ImageIcon> oyuncubKartOlustur() {

        oyuncuImagesb.add(new ImageIcon(new ImageIcon("kartlarb/cedi.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesb.add(new ImageIcon(new ImageIcon("kartlarb/kobe.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesb.add(new ImageIcon(new ImageIcon("kartlarb/jordan.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesb.add(new ImageIcon(new ImageIcon("kartlarb/mehmet.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesb.add(new ImageIcon(new ImageIcon("kartlarb/semih.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesb.add(new ImageIcon(new ImageIcon("kartlarb/cenk.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesb.add(new ImageIcon(new ImageIcon("kartlarb/harden.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        oyuncuImagesb.add(new ImageIcon(new ImageIcon("kartlarb/hidayet.jpg").getImage().getScaledInstance(200, 286, Image.SCALE_DEFAULT)));
        return oyuncuImagesb;

    }

    public void oyuncuolustur() {
        futbolcu Messi = new futbolcu("Messi", "futbolcu", 50, 25, 10);
        futbolcular.add(Messi);
        futbolcu Ronaldo = new futbolcu("Ronaldo", "futbolcu", 50, 52, 23);
        futbolcular.add(Ronaldo);
        futbolcu Ronaldinho = new futbolcu("Ronaldinho", "futbolcu", 60, 52, 15);
        futbolcular.add(Ronaldinho);
        futbolcu Neymar = new futbolcu("Neymar", "futbolcu", 55, 51, 23);
        futbolcular.add(Neymar);
        futbolcu Sabri = new futbolcu("Sabri", "futbolcu", 50, 25, 17);
        futbolcular.add(Sabri);
        futbolcu Beckham = new futbolcu("Beckham", "futbolcu", 50, 25, 17);
        futbolcular.add(Beckham);
        futbolcu Karius = new futbolcu("Karius", "futbolcu", 40, 33, 20);
        futbolcular.add(Karius);
        futbolcu Muslera = new futbolcu("Muslera", "futbolcu", 45, 30, 18);
        futbolcular.add(Muslera);

        basketbolcu Cedi = new basketbolcu("Cedi", "basketbolcu", 10, 15, 20);
        basketbolcular.add(Cedi);
        basketbolcu Kobe = new basketbolcu("Kobe", "basketbolcu", 10, 80, 70);
        basketbolcular.add(Kobe);
        basketbolcu Jordan = new basketbolcu("Jordan", "basketbolcu", 25, 15, 75);
        basketbolcular.add(Jordan);
        basketbolcu Mehmet = new basketbolcu("Mehmet", "basketbolcu", 35, 75, 20);
        basketbolcular.add(Mehmet);
        basketbolcu Semih = new basketbolcu("Semih", "basketbolcu", 40, 53, 33);
        basketbolcular.add(Semih);
        basketbolcu Cenk = new basketbolcu("Cenk", "basketbolcu", 45, 65, 15);
        basketbolcular.add(Cenk);
        basketbolcu Harden = new basketbolcu("Harden", "basketbolcu", 45, 65, 15);
        basketbolcular.add(Harden);
        basketbolcu Hidayet = new basketbolcu("Hidayet", "basketbolcu", 95, 65, 13);
        basketbolcular.add(Hidayet);
//  System.out.println(messi.futbolcuAdi+"adı"+messi.futbolcuTakim+"takım"+messi.getPenaltı()+" "+messi.getKaleciKarsiKarsiya()+" "+messi.getSerbestAtis());

    }

    public void futbolkartAta(oyuncu oyuncu) {
        Random random = new Random();
        int kullanildiMi = 0;
        int sayi = 0;
        int temp;

        while (true) {
            kullanildiMi = 0; // kullanılankartlar destesinde, üretilen random sayı varsa yeniden random sayı üretilmesi için
            temp = random.nextInt(8);
            for (int i = 0; i < kullanılanKartlarfutbol.size(); i++) {
                if (temp == kullanılanKartlarfutbol.get(i)) {
                    kullanildiMi++;
                }

            }
            if (kullanildiMi == 0 && sayi < 4) {

                kullanılanKartlarfutbol.add(temp);
                oyuncu.kartListesif[sayi][0] = String.valueOf(temp);
                oyuncu.kartListesif[sayi][1] = futbolcular.get(temp).getFutbolcuAdi();
                oyuncu.kartListesif[sayi][2] = Integer.toString(futbolcular.get(temp).getPenaltı());
                oyuncu.kartListesif[sayi][3] = Integer.toString(futbolcular.get(temp).getSerbestAtis());
                oyuncu.kartListesif[sayi][4] = Integer.toString(futbolcular.get(temp).getKaleciKarsiKarsiya());
               
                sayi++;

            }
            if (sayi == 4) {
                break;
            }

        }

    }

    public void basketbolkartAta(oyuncu oyuncu) {
        Random random = new Random();
        int kullanildiMi = 0;
        int sayi = 0;
        int temp;

        while (true) {
            kullanildiMi = 0; // kullanılankartlar destesinde, üretilen random sayı varsa yeniden random sayı üretilmesi için
            temp = random.nextInt(8);
            for (int i = 0; i < kullanılanKartlarbasketbol.size(); i++) {
                if (temp == kullanılanKartlarbasketbol.get(i)) {
                    kullanildiMi++;
                }

            }
            if (kullanildiMi == 0 && sayi < 4) {
                kullanılanKartlarbasketbol.add(temp);
                oyuncu.kartListesib[sayi][0] = String.valueOf(temp);
                oyuncu.kartListesib[sayi][1] = basketbolcular.get(temp).getbasketbolcuAdi();
                oyuncu.kartListesib[sayi][2] = Integer.toString(basketbolcular.get(temp).getIkilik());
                oyuncu.kartListesib[sayi][3] = Integer.toString(basketbolcular.get(temp).getUcluk());
                oyuncu.kartListesib[sayi][4] = Integer.toString(basketbolcular.get(temp).getSerbestAtis());
               
                sayi++;

                if (sayi == 4) {
                    break;
                }

            }

        }
    }

    public void futbolkartAtab(oyuncu oyuncu) {
        Random random = new Random();
        int kullanildiMi = 0;
        int sayi = 0;
        int temp;

        while (true) {
            kullanildiMi = 0; // kullanılankartlar destesinde, üretilen random sayı varsa yeniden random sayı üretilmesi için
            temp = random.nextInt(8);
            for (int i = 0; i < kullanılanKartlarfutbol.size(); i++) {
                if (temp == kullanılanKartlarfutbol.get(i)) {
                    kullanildiMi++;
                }

            }
            if (kullanildiMi == 0 && sayi < 4) {

                kullanılanKartlarfutbol.add(temp);
                oyuncu.kartListesifb[sayi][0] = String.valueOf(temp);
                oyuncu.kartListesifb[sayi][1] = futbolcular.get(temp).getFutbolcuAdi();
                oyuncu.kartListesifb[sayi][2] = Integer.toString(futbolcular.get(temp).getPenaltı());
                oyuncu.kartListesifb[sayi][3] = Integer.toString(futbolcular.get(temp).getSerbestAtis());
                oyuncu.kartListesifb[sayi][4] = Integer.toString(futbolcular.get(temp).getKaleciKarsiKarsiya());
                
                sayi++;

            }
            if (sayi == 4) {
                break;
            }

        }

    }

    public void basketbolkartAtab(oyuncu oyuncu) {
        Random random = new Random();
        int kullanildiMi = 0;
        int sayi = 0;
        int temp;

        while (true) {
            kullanildiMi = 0; // kullanılankartlar destesinde, üretilen random sayı varsa yeniden random sayı üretilmesi için
            temp = random.nextInt(8);
            for (int i = 0; i < kullanılanKartlarbasketbol.size(); i++) {
                if (temp == kullanılanKartlarbasketbol.get(i)) {
                    kullanildiMi++;
                }

            }
            if (kullanildiMi == 0 && sayi < 4) {
                kullanılanKartlarbasketbol.add(temp);
                oyuncu.kartListesibb[sayi][0] = String.valueOf(temp);
                oyuncu.kartListesibb[sayi][1] = basketbolcular.get(temp).getbasketbolcuAdi();
                oyuncu.kartListesibb[sayi][2] = Integer.toString(basketbolcular.get(temp).getIkilik());
                oyuncu.kartListesibb[sayi][3] = Integer.toString(basketbolcular.get(temp).getUcluk());
                oyuncu.kartListesibb[sayi][4] = Integer.toString(basketbolcular.get(temp).getSerbestAtis());
               
                sayi++;

                if (sayi == 4) {
                    break;
                }

            }

        }
    }

 


   

   
}
