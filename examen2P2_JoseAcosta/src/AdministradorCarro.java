
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class AdministradorCarro {
    
    private ArrayList<Carro> carro = new ArrayList();
    private File file = null;

    public AdministradorCarro(String path) {
        file = new File(path);
    }

    public ArrayList<Carro> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Carro> carro) {
        this.carro = carro;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public void setCarro(Carro carros){
        carro.add(carros);
    }
    
    
     public void cargarArchivo() {
        try {
            carro = new ArrayList();
            Carro temp;
            if (file.exists()) {
                FileInputStream entrada = new FileInputStream(file);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carro) objeto.readObject()) != null) {
                        carro.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            for (Carro u : carro) {
                oos.writeObject(u);
            }
            oos.flush();
        } catch (Exception ex) {
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
    
}
