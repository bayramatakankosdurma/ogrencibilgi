/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package öğrencibilgisistemi;

/**
 *
 * @author Atakan
 */
public class BursluÖğrenci extends NormalÖğrenci {
    private String Burs;
    
    public BursluÖğrenci(){
        super();
        Burs="0";
        }
    public BursluÖğrenci(String Sınavnotu,
            String Burs,String numara, String ad, String soyad){
        super(Sınavnotu,numara,ad,soyad);
        this.Burs=Burs;
        
    }



    public String getBurs() {
        return Burs;
    }

    public void setBurs(String Burs) {
        this.Burs = Burs;
    }
    
    
}
