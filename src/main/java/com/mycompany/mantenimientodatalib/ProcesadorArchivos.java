
package com.mycompany.mantenimientodatalib;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Logger;


public class ProcesadorArchivos implements Serializable {
    
    public boolean validarArchivo(final String path){
        boolean salida=false;
        try {
            FileReader entrada=new FileReader(path);
            try {
                int codigo=entrada.read();
                String cadena="";
            while (codigo != -1) {
                char letra=(char) codigo;
                cadena+=letra;
                codigo=entrada.read();
            }
                objetosSeparados(cadena);
            } catch (Exception e) {
                System.out.println("No se logro hacer el flujo de datos");
            }finally{
                entrada.close();
            }
        }catch (IOException e) {
            System.out.println("La cagamos");
        }
        return salida;
    }
    
    
    public String[] objetosSeparados(String cadena){
        
        String objetos[]=cadena.split(",");
        
        return objetos;
    }
    
}
