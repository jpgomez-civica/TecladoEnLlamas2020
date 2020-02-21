
package day_1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Parte1 {

    public static void main(String[] args) {
        String pathFile = ".\\planta.txt";
        int plantaActual = 0;
        String [] array = null;        
        try {
            BufferedReader lector = new BufferedReader(new FileReader(pathFile));
            array = lector.readLine().split("");
            lector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for(String l: array) {
            plantaActual += (l.equals("(")) ? 1 : -1;
        }
      System.out.println("Respuesta parte 1: "+plantaActual);
    }

}
