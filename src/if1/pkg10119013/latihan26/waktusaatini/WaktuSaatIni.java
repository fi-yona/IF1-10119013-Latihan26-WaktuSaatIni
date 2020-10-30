/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan26.waktusaatini;

/**
 *
 * @author Fiona Avila
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WaktuSaatIni {
    
    public static void main(String[] args) {
       Date date = new Date(); 
       Locale lokal = Locale.forLanguageTag("id");
       SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);
       
       System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
    
}
