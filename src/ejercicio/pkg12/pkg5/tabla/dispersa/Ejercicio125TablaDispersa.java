/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12.pkg5.tabla.dispersa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio125TablaDispersa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 1;
        String codigo;
        Scanner sc = new Scanner(System.in);
        TablaDispersa tabla = new TablaDispersa();
        
        while(menu!=0){
            System.out.println("Elija una opcion: \n"); 
            System.out.println("1. Cargar Casa rural \n"); 
            System.out.println("2. Buscar Casa rural \n"); 
            System.out.println("3. Eliminar Casa rural \n"); 
            System.out.println("0. Salir \n");
            
            menu = sc.nextInt();
            sc.nextLine();
            
            switch(menu){
                
                case 1:
                    CasaRural casa = new CasaRural();
                    tabla.insertar(casa);
                    break;
                    
                case 2:
                    System.out.println("Ingrese un codigo: \n"); 
                    codigo = sc.nextLine();
                    tabla.buscar(codigo);
                    break;
                    
                case 3:
                    System.out.println("Ingrese un codigo: \n"); 
                    codigo = sc.nextLine();
                    tabla.eliminar(codigo);
                    break;
            }
        }    
    }        
}                
            
        
        
    
    

