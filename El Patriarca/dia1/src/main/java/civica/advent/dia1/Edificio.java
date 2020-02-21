package civica.advent.dia1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Edificio {
  
    static final String SUBIRPISO= "(";
    private String pisos;

    public Edificio(){
      
        try {
            this.setPisos(this.getMovimientosAscensor());
        } catch (IOException ex) {
            Logger.getLogger(Edificio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getPisos() {
        return pisos;
    }

    public void setPisos(String pisos) {
        this.pisos = pisos;
    }
    //Lee fichero con datos de parentesis
    private String getMovimientosAscensor() throws IOException{
    File fichero = new File("./ascensor.txt");
        String texto="";
        try {
           BufferedReader lineas = new BufferedReader(new FileReader(fichero));
            while ((texto = lineas.readLine()) != null) {
                    return texto;
              } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Edificio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return texto;
    }
    //revuelve array
    private String [] StringToArray(){
        return this.getPisos().split("");
    }
    //Metodo que dice el piso al que llega 
    public int calcularPiso(){
        
        int numPiso = 0;
        for (int i = 0; i < StringToArray().length; i++) {
            if (SUBIRPISO.equals(StringToArray()[i])) {
                numPiso++;
            } else {
                numPiso--;
            }
        }
        return numPiso;
    }
    //obtenemos posicion del primer piso del sotano
    public int getPosicionPrimerCaracterSotano(){
       int posicionSotano = 0;
       int contador = 0;
        for (int i = 0; i < StringToArray().length; i++) {
            if (SUBIRPISO.equals(StringToArray()[i])) {
                contador++;
            } else {
                contador--;
            }
            posicionSotano++;
            if(contador<0){  
                break;
            }
             
        }
        return posicionSotano; 
    }
    
}
