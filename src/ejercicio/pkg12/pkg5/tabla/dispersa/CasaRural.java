/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg12.pkg5.tabla.dispersa;

import java.io.*;


public class CasaRural
{
    private String codigo;
    private String poblacion;
    private String direccion;
    private int numHabitacion = 0;
    private double precio = 0.0;
    boolean esAlta;
    public CasaRural()
    {
        esAlta = true;
        asigna();
    }
    
    public void asigna()
    {
        BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
        try {
            System.out.print("\n Codigo (10 caracteres): ");
            codigo = entrada.readLine();
            System.out.print("\n Población: ");
            poblacion = entrada.readLine();
            System.out.print("\n Dirección: ");
            direccion = entrada.readLine();
            System.out.print("\n Número de habitaciones: ");
            numHabitacion = Integer.parseInt(entrada.readLine());
            System.out.print("\n Precio por día de estancia: ");
            precio = (new Double(entrada.readLine())).doubleValue();
        }
        catch (IOException e)
        {
            System.out.println(" Excepcion en la entrada de datos " +
            e.getMessage()+ " . No se da de alta");
            esAlta = false;
        }
    }
    public String elCodigo()
    {
        return codigo;
    }
    public void muestra()
    {
        System.out.println("\n Casa Rural " + codigo);
        System.out.println("Población: " + poblacion);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio por día: " + precio);
    }
}

