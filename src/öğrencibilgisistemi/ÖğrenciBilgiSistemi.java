package öğrencibilgisistemi;
//Yazar Atakan BTÜ
//Lütfen ilk kez çalıştırdığınızda 2 kere Akademisyen seçip birer tane burslu ve
//burssuz öğrenci ekleyiniz. 1 kere de akademisyen seçip akademisyen ekleyiniz.
//yoksa program istenildiği gibi çalışmaz.
//eklenen öğrenci ve akademisyenlerin 1 tane adı olmalı
//aynı şekilde akademisyenin de 1 adı olmalı
//lütfet akademisyenin alanını ve bölümünü eklerken 1 kelime ile yazınız
//sadece profesör veya sadece doçent gibi veya sadece bilgisayar gibi.
//Bunlar yapıldıktan sonra listelemeye bakılabilir.
//@@@@@@@@@@@@@@@@@ Önemli
//@@@@@@@@@@@@@@@@@ Önemli

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ÖğrenciBilgiSistemi {

    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        File x = new File("Burssuznotlar.txt");
        if (!x.exists()) {
            x.createNewFile();
        }
        File a = new File("Burslunotlar.txt");
        if (!a.exists()) {
            a.createNewFile();
        }
        File b = new File("Akademisyen.txt");
        if (!b.exists()) {
            b.createNewFile();
        }
//Dosya oluşturuyor. var mı diye kontrol edip yoksa oluşturuyor.

        System.out.println("Öğrenci Bilgi Sistemi'ne Hoş Geldiniz.");
        System.out.println("Normal Öğrenci iseniz 1, Burslu Öğrenci iseniz 2,"
                + " Akademisyen İseniz 3, Akademisyen"
            + " Listesine bakmak için 4, Akademisyen eklemek için 5 yazınız.");

//Hangi işlemin yapılacağını seçmek için switch case.
        Scanner scanner = new Scanner(System.in);
        int bilgisistemi = scanner.nextInt();

        if (bilgisistemi == 1) {
            System.out.println("Öğrenci adı, soyadı, numarası ve"
                    + " notları aşağıdaki"
                    + " gibidir; ");
            System.out.println(" ");

//bilgi yazma öğretmen girişinde yapılacak şimdilik sadece okuma ve listeleme.
            File hachibi = new File("Burssuznotlar.txt");
            Scanner oku = new Scanner(hachibi);

            while (oku.hasNext()) {
                String önad = oku.next();
                String soyad = oku.next();
                String numara = oku.next();
                String sınavnotu = oku.next();
                System.out.println("Öğrencinin adı: " + önad + " Soy adı: " + soyad
                        + " Öğrencinin Numarası: " + numara + " Sınav Notu: " + sınavnotu);
                System.out.println(" ");
            }
            oku.close();
        }
        if (bilgisistemi == 2) {
            System.out.println("Öğrencinin adı, soyadı, numarası, "
                    + "sınav notu ve bursu"
                    + " aşağıdaki gibidir;");
            System.out.println(" ");

//normal öğrenciden farkı bursa sahip olmasıdır.
            File kurama = new File("Burslunotlar.txt");
            Scanner oku = new Scanner(kurama);
            while (oku.hasNext()) {
                String önad = oku.next();
                String soyad = oku.next();
                String numara = oku.next();
                String burs = oku.next();
                String sınavnotu = oku.nextLine();
                System.out.println("Öğrencinin adı: " + önad + " Soy adı: " + soyad
                        + " Öğrencinin Numarası: " + numara + " Öğrencinin aldığı burs:" + burs
                        + " TL. Sınav Notu: " + sınavnotu);
                System.out.println(" ");
            }
            oku.close();
        }
        if (bilgisistemi == 3) {
//yeni öğrenci ve öğrenci ile ilgili şeyler girme.

            System.out.println("Yapmak istediğiniz işlemi seçiniz; ");
            System.out.println("");
            System.out.println("Yeni burssuz öğrenci eklemek ve sınav notu yazmak "
                    + "için 1 yazınız,");
            System.out.println("");
            System.out.println("Yeni burslu öğrenci eklemek ve sınav notu yazmak"
                    + " için 2 yazınız,");
            System.out.println("");
            //Yapılacak işlem için bir kere daha switch case.
            Scanner oku = new Scanner(System.in);
            int işlem = oku.nextInt();

            if (işlem == 1) {
                PrintWriter outputingen = new PrintWriter("Burssuznotlar.txt");

                outputingen.print("Ezel Bayraktar ");
                outputingen.print("18863563608 ");
                outputingen.println(100);
                outputingen.print("Eyşan Atay ");
                outputingen.print("18458028530 ");
                outputingen.println(13);
//yeni öğrenci oluşturup bunu Burssuznotlar.txt' konumuna yazıyor.

                System.out.println("Lütfen öğrencinin adını giriniz;");
                NormalÖğrenci eee = new NormalÖğrenci();
                eee.setÖğrenciAd(oku.next());
                outputingen.print(eee.getÖğrenciAd() + " ");
                System.out.println("Lütfen öğrencinin soyadını giriniz;");
                eee.setÖğrenciSoyad(oku.next());
                outputingen.print(eee.getÖğrenciSoyad() + " ");
                System.out.println("Lütfen öğrencinin numarasını giriniz;");
                eee.setÖğrenciNumarası(oku.next());
                outputingen.print(eee.getÖğrenciNumarası() + " ");
                System.out.println("Lütfen öğrencinin sınav notunu giriniz;");
                eee.setSınavNotu(oku.next());
                outputingen.print(eee.getSınavNotu());
                outputingen.close();
                
                File ichibi = new File("Burssuznotlar.txt");
                Scanner oku1 = new Scanner(ichibi);

                while (oku1.hasNext()) {
                    String önad = oku1.next();
                    String soyad = oku1.next();
                    String numara = oku1.next();
                    String sınavnotu = oku1.next();
                    System.out.println("Öğrencinin adı: " + önad + " Soy adı: " + soyad
                            + " Öğrencinin Numarası: " + numara + " Sınav Notu: " + sınavnotu);
                    System.out.println(" ");
                }
                oku1.close();

            }
            if (işlem == 2) {
                
                PrintWriter outputter = new PrintWriter("Burslunotlar.txt");
                outputter.print("Ramiz Karaeski ");
                outputter.print("18863563608 ");
                outputter.print("1200 ");
                outputter.println("100");
                //gönlüm dayıya sınırsız burs vermek istiyor ama ne yaparsınız..
                
                
                outputter.print("Kenan Işık ");
                outputter.print("18458028530 ");
                outputter.print("900 ");
                outputter.println("93");
                //yeni öğrenci oluşturup Burslunotlar.txt'ye yazıyor.
                
                System.out.println("Lütfen öğrencinin adını giriniz;");
                BursluÖğrenci aaa = new BursluÖğrenci();
                
                aaa.setÖğrenciAd(oku.next());
                outputter.print(aaa.getÖğrenciAd() + " ");
                
                System.out.println("Lütfen öğrencinin soyadını giriniz;");
                aaa.setÖğrenciSoyad(oku.next());
                outputter.print(aaa.getÖğrenciSoyad() + " ");
                
                System.out.println("Lütfen öğrencinin numarasını giriniz;");
                aaa.setÖğrenciNumarası(oku.next());
                outputter.print(aaa.getÖğrenciNumarası() + " ");
               
                System.out.println("Lütfen öğrencinin aldığı bursu giriniz;");
                aaa.setBurs(oku.next());
                outputter.print(aaa.getBurs()+" ");
                
                System.out.println("Lütfen öğrencinin sınav notunu giriniz;");
                aaa.setSınavNotu(oku.next());
                outputter.print(aaa.getSınavNotu());
                
                outputter.close();
                
            File Shukaku = new File("Burslunotlar.txt");
            Scanner oku2 = new Scanner(Shukaku);
            while (oku2.hasNext()) {
                String önad = oku2.next();
                String soyad = oku2.next();
                String numara = oku2.next();
                String burs = oku2.next();
                String sınavnotu = oku2.next();
                System.out.println("Öğrencinin adı: " + önad + " Soy adı: " + soyad
                        + " Öğrencinin Numarası: " + numara + " Öğrencinin aldığı burs:" + burs
                        + " TL. Sınav Notu: " + sınavnotu);
                System.out.println(" ");
            }
            oku2.close();
            }
        }

        if(bilgisistemi==4){
            File kyuubi = new File("Akademisyen.txt");
            System.out.println("Akademistenler listedeki gibidir;");
            System.out.println("");
            
            Scanner oku5 = new Scanner(kyuubi);
            while (oku5.hasNext()) {
                String önad = oku5.next();
                String soyad = oku5.next();
                String alan = oku5.next();
                String eğitim = oku5.next();
                
                System.out.println("Akademisyenin adı: " + önad + " Soy adı: " + soyad
                        + " Akademisyenin alanı: "+alan+" Akademisyenin"
                                + " Eğitim seviyesi: "+eğitim);
                System.out.println(" ");
            }
            oku5.close();
        }
        
    if(bilgisistemi==5){
        Scanner oku= new Scanner(System.in);
        //akademisyen ekleme
        PrintWriter outputin= new PrintWriter("Akademisyen.txt");
        
        outputin.print("Tevfik Zaim");
        outputin.print(" Savunma");
        outputin.println(" Profesor");
        
        outputin.print("Ali Kırgız");
        outputin.print(" Sanayi");
        outputin.println(" Doçent");
        
        Akademisyen bb= new Akademisyen();
        
        System.out.println("Eklemek istediğiniz akademisyenin adını yazınız.");
        bb.setAkademisyenad(oku.next());
        outputin.print(bb.getAkademisyenad()+" ");
        
        System.out.println("Eklemek istediğiniz akademisyennin soyadını yazınız");
        bb.setAkademisyensoyad(oku.next());
        outputin.print(bb.getAkademisyensoyad()+" ");
        
        System.out.println("Eklemek istediğiniz akademisyenin alanını yazınız");
        bb.setAkademisyenAlan(oku.next());
        outputin.print(bb.getAkademisyenAlan()+" ");
        
        System.out.println("Eklemek istediğiniz akademisyenin eğitim seviyesi"
                + "ni yazınız;");
        bb.setAkademisyenEğitimseviyesi(oku.next());
        outputin.print(bb.getAkademisyenEğitimseviyesi());
        outputin.close();
    }
    }

}
