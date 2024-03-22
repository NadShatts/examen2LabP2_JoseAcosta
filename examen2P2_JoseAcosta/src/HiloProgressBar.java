
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class HiloProgressBar extends Thread {
    
private JProgressBar barra1, barra2;
private int velocidad1, velocidad2;
private Carro carro;

    public HiloProgressBar(JProgressBar barra1, JProgressBar barra2, int velociadad1, int velocidad2) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.velocidad1 = velociadad1;
        this.velocidad2 = velocidad2;
    }
    
    public HiloProgressBar(JProgressBar barra1, JProgressBar barra2) {
        this.barra1 = barra1;
        this.barra2 = barra2;
    }
 
public void run(){
    while(barra2.getValue() < 100 && barra1.getValue() < 100){
        barra1.setValue(barra1.getValue() + velocidad1);
        barra2.setValue(barra2.getValue() + velocidad2);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
    if(barra1.getValue() > barra2.getValue()){
        JOptionPane.showMessageDialog(barra1, "Gano el Carro numero 1 con un tiempo de "+velocidad1+ " segundos");
    }else if(barra2.getValue() > barra1.getValue()){
        JOptionPane.showMessageDialog(barra1, "Gano el Carro numero 2 con un tiempo de "+velocidad2+ " segundos");
    }else{
        JOptionPane.showMessageDialog(barra1, "Hubo un Empate entre los 2 carros");
    }
    
}

    
}
