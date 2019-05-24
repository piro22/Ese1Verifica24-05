/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1verificarecupero;

import java.io.IOException;

/**
 *
 * @author Pirovano_Giacomo
 */
public class Ese1verificaRecupero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));    
        
    DatiCondivisi dc = new DatiCondivisi();    
        
    ThRazzo1 r1 = new ThRazzo1(dc);
    ThRazzo2 r2 = new ThRazzo2(dc);
    ThRoccia1 ro1 = new ThRoccia1(dc);
    ThRoccia2 ro2 = new ThRoccia2(dc);
    String buffer="0000";
    
    
    while(!(buffer.equals("s"))){
        System.out.println("scrivi s per far partire il razzo1");
        buffer = console.readLine();
    }
    
    
    r1.start();
    dc.semR1Wait();
    buffer="0000";
    
    
    while(!(buffer.equals("s"))){
        System.out.println("scrivi s per far partire il razzo2");
        buffer = console.readLine();
    }
    
    r2.start();
    dc.semR2Wait();
    System.out.println(buffer);
    buffer="0000";
    
    
    ro1.start();
    ro2.start();
    
    dc.semFine1Wait();
    dc.semFine2Wait();
    
    System.out.println("ENTRAMBE LE ROCCIE SONO DISTRUTTE");
    
    }
    
    
}
