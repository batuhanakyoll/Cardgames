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
public class sporcu {

    static Object get(int temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
  private String sporcuIsim;
   private String  sporcuTakim;

    public sporcu() {
      
    }

    public sporcu(String sporcuIsim, String sporcuTakim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim =  sporcuTakim;
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
 public int sporcuPuaniGoster(){
        return 0;
    
    }
   
    

    

   
    
}
