/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1verificarecupero;

import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pirovano_Giacomo
 */
public class DatiCondivisi {
    
    Semaphore SemR1;
    Semaphore SemR2;
    
    Semaphore SemFine1;
    Semaphore SemFine2;

    public DatiCondivisi() {
        SemR1 = new Semaphore(0);
        SemR2 = new Semaphore(0);
        
        SemFine1 = new Semaphore(0);
        SemFine2 = new Semaphore(0);
    }
    
    public void semR1Signal(){
        SemR1.release();
    }
    
    public void semR2Signal(){
        SemR2.release();
    }
    
    
    
    public void semFine1Signal(){
        SemFine1.release();
    }
    public void semFine2Signal(){
        SemFine2.release();
    }
    
    
    public void semR1Wait() {
        
        try {
            SemR1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void semR2Wait() {
        
        try {
            SemR2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    
    
    
    public void semFine1Wait() {
        
        try {
            SemFine1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void semFine2Wait() {
        
        try {
            SemFine2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
