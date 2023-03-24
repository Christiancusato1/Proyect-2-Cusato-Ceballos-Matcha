
package Proyecto2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Funciones {
    public void CrearArchivo(){
        try{
        FileWriter file= new FileWriter("C:\\Users\\Juan Ceballos\\Documents\\NetBeansProjects\\QuizN2JuanCeballosSeccion2\\src\\test\\java\\Arbol.txt");
        file.close();
            JOptionPane.showMessageDialog(null, "Se creó el archivo exitosamente");
        }catch (IOException ex){
         Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
       public void Escribir_txt(String informacion){
        ///String informacion = "";
        ///while(!pila.isEmpty()) {
            ///String valor = (String) pila.pop2().getElemento();
            ///informacion += valor;        
        ///}
        try{
            PrintWriter pw = new PrintWriter("C:\\Users\\Juan Ceballos\\Documents\\NetBeansProjects\\QuizN2JuanCeballosSeccion2\\src\\test\\java\\ArbolBB.txt");
            pw.print(informacion);
            pw.close();
            JOptionPane.showMessageDialog(null, "ÉXITO AL REGISTRAR! ");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "ÉRROR AL REGISTRAR! ");
        }
    }
       
      public void CrearArchivoArreglo(){
        try{
        FileWriter file= new FileWriter("C:\\Users\\Juan Ceballos\\Documents\\NetBeansProjects\\QuizN2JuanCeballosSeccion2\\src\\test\\java\\Arreglo.txt");
        file.close();
            JOptionPane.showMessageDialog(null, "Se creó el archivo exitosamente");
        }catch (IOException ex){
         Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
       public void Escribir_txtArreglo(Pila pila){
        
        String informacion = "";
        
        while(!pila.isEmpty()) {
            String valor = (String) pila.pop2().getElemento();
            informacion += valor;        
        }
        try{
            PrintWriter pw = new PrintWriter("C:\\Users\\Juan Ceballos\\Documents\\NetBeansProjects\\QuizN2JuanCeballosSeccion2\\src\\test\\java\\Arreglo.txt");
            pw.print(informacion);
            pw.close();
            JOptionPane.showMessageDialog(null, "ÉXITO AL REGISTRAR! ");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "ÉRROR AL REGISTRAR! ");
        }
    }
    
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
    
}
