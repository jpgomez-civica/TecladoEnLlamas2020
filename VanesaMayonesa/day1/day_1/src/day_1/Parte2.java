package day_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Parte2 {

    public static void main(String[] args) {      
      String pathFile = ".\\planta.txt";
      int plantaActual = 0;
      String [] array = null;        
      
      try {
          BufferedReader lector = new BufferedReader(new FileReader(pathFile));
          array = lector.readLine().split("");
          lector.close();
      } catch (IOException e) {
          e.printStackTrace();
      }
      
      for (int i = 0; i < array.length; i++) {
          plantaActual += (array[i].equals("(")) ? 1 : -1;
          array[i] = ""+plantaActual;
      }
      int posicion = Arrays.asList(array).indexOf("-1")+1;
      System.out.println("Respuesta parte 1: " + plantaActual);
      System.out.println("Respuesta parte 2: "+posicion);
      
      
    }

}
