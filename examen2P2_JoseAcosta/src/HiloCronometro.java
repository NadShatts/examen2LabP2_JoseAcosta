
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class HiloCronometro extends Thread {
    
    private JLabel cronometro;
    private boolean corre;
    
    public void run(){
        while(corre){ 
            Date date = new Date();
            SimpleDateFormat s = new SimpleDateFormat("mm:ss");
            
        }
    }
    
    
}
