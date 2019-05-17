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
public class Akademisyen {
    private String AkademisyenAlan;
    private String Akademisyenad;
    private String Akademisyensoyad;
    private String AkademisyenEğitimseviyesi;
    public Akademisyen(){
        this.Akademisyenad=null;
        this.Akademisyensoyad=null;
        this.AkademisyenAlan=null;
        this.AkademisyenEğitimseviyesi=null;
        
    }

    public String getAkademisyenAlan() {
        return AkademisyenAlan;
    }

    public void setAkademisyenAlan(String AkademisyenBölüm) {
        this.AkademisyenAlan = AkademisyenBölüm;
    }

    public String getAkademisyenad() {
        return Akademisyenad;
    }

    public void setAkademisyenad(String Akademisyenad) {
        this.Akademisyenad = Akademisyenad;
    }

    public String getAkademisyensoyad() {
        return Akademisyensoyad;
    }

    public void setAkademisyensoyad(String Akademisyensoyad) {
        this.Akademisyensoyad = Akademisyensoyad;
    }

    public String getAkademisyenEğitimseviyesi() {
        return AkademisyenEğitimseviyesi;
    }

    public void setAkademisyenEğitimseviyesi(String AkademisyenEğitimseviyesi) {
        this.AkademisyenEğitimseviyesi = AkademisyenEğitimseviyesi;
    }
    
}
