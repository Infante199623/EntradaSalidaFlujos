/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribiendoflujosalida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author pedro
 */
public class EscribiendoFlujoSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nomFichero = "FlujodatosES";
        File f = new File(nomFichero);
        
        
        if(f.exists()){
            System.out.println("Fichero " + nomFichero + "ya existe.No se hace nada.");
            return;
        }
        
        try{
           
            BufferedWriter bfw = new BufferedWriter(new FileWriter(f));
            PrintWriter pw;
            pw = new PrintWriter(bfw);
            
            pw.write("essto es un fichero de texto");
            bfw.newLine();
            pw.write("quiza no esta bien del todo");
            bfw.newLine();
            bfw.close();
            bfw = new BufferedWriter(new FileWriter(f,true));
            pw.write("Pero se puede arreglar");
            bfw.newLine();
            bfw.close();
            pw.close();
            
        }catch(IOException e){
        
            System.out.println(e.getMessage());
        
        }
    }
    
}
