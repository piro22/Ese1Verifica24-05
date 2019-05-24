/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1verificarecupero;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pirovano_Giacomo
 */
public class ThRoccia2 extends Thread{
    DatiCondivisi dc;

    public ThRoccia2(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    public void run(){
        
        try {
            
            
            System.out.println("INIZIO DISINTEGRAZIONE ROCCIA2");
            sleep(1500);
            
            System.out.println("FINE DISINTEGRAZIONE ROCCIA2");
            sleep(1500);
            
            dc.semFine1Signal();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRoccia2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
}
