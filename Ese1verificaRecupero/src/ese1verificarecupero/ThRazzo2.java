/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1verificarecupero;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pirovano_Giacomo
 */
public class ThRazzo2 extends Thread{
    DatiCondivisi dc;

    public ThRazzo2(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    public void run() {

        try {
            
            
            System.out.println("RAZZO 2 PARTITO");
            sleep(1500);
            dc.semR2Signal();
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzo1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
