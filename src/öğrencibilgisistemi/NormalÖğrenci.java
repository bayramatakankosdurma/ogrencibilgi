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
public class NormalÖğrenci  {
    private String ÖğrenciNumarası;
    private String ÖğrenciAd;
    private String ÖğrenciSoyad;
    public String SınavNotu;
    
    public NormalÖğrenci(){
        this.ÖğrenciAd=null;
        this.ÖğrenciSoyad=null;
        this.ÖğrenciNumarası="0";
        this.SınavNotu="0";
    }
    public NormalÖğrenci(String SınavNotu, String ÖğrenciNumarası,
            String ÖğrenciAd, String ÖğrenciSoyad){
        this.ÖğrenciAd=ÖğrenciAd;
        this.ÖğrenciSoyad=ÖğrenciSoyad;
        this.ÖğrenciNumarası=ÖğrenciNumarası;
        this.SınavNotu=SınavNotu;
    }




    public String getÖğrenciNumarası() {
        return ÖğrenciNumarası;
    }

    public void setÖğrenciNumarası(String ÖğrenciNumarası) {
        this.ÖğrenciNumarası = ÖğrenciNumarası;
    }

    public String getÖğrenciAd() {
        return ÖğrenciAd;
    }

    public void setÖğrenciAd(String ÖğrenciAd) {
        this.ÖğrenciAd = ÖğrenciAd;
    }

    public String getÖğrenciSoyad() {
        return ÖğrenciSoyad;
    }

    public void setÖğrenciSoyad(String ÖğrenciSoyad) {
        this.ÖğrenciSoyad = ÖğrenciSoyad;
    }
        public String getSınavNotu() {
        return SınavNotu;
    }

    public void setSınavNotu(String SınavNotu) {
        this.SınavNotu = SınavNotu;
    }
}
