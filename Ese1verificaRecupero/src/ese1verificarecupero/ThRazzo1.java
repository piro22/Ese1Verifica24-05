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
public class ThRazzo1 extends Thread{
    DatiCondivisi dc;

    public ThRazzo1(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    public void run() {

        try {
            
            
            System.out.println("RAZZO 1 PARTITO");
            sleep(1500);
            dc.semR1Signal();
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzo1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
