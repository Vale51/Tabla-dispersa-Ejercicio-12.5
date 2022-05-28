/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg12.pkg5.tabla.dispersa;

/**
 *
 * @author user
 */
public class TablaDispersa {
    static final int TAMTABLA = 101;
    private int numElementos;
    private double factorCarga;
    private CasaRural [] tabla;
    
    public TablaDispersa()
    {
        tabla = new CasaRural[TAMTABLA];
        
        for(int j = 0; j < TAMTABLA ; j++)
            tabla[j] = null;
        
        numElementos = 0;
        factorCarga = 0.0;
    }

    public int direccion(String clave) //devuelve una direccion 
    {
        int i = 0, p;
        long d;
        d = transformaCadena(clave);
        // aplica aritmética modular para obtener dirección base
        p = (int)(d % TAMTABLA);
        // bucle de exploración
        while (tabla[p]!= null && !tabla[p].elCodigo().equals(clave))
        {
            i++;
            p = p + i*i;
            p = p % TAMTABLA; // considera el array como circular
        }
        
        return p;
    }
    long transformaCadena(String c)
    {
        long d;
        d = 0;
        for (int j = 0; j < Math.min(10,c.length()); j++)
        {
            d = d * 27 + (int)c.charAt(j);
        }
        if (d < 0) d = -d;
            return d;
    }
    
    public void insertar(CasaRural r)
    {
        int posicion;
        posicion = direccion(r.elCodigo());
        tabla[posicion] = r;
        numElementos++;
        factorCarga = (double)(numElementos)/TAMTABLA;
        if (factorCarga > 0.5)
            System.out.println("\n!! Factor de carga supera el 50%.!!"
            + " Conviene aumentar el tamaño." );
    }
    
    public CasaRural buscar(String clave)
    {
        CasaRural pr;
        int posicion;
        posicion = direccion(clave);
        pr = tabla[posicion];
        if (pr != null)
            if (! pr.esAlta) pr = null;
                return pr;
    }
    
    public void eliminar(String clave)
    {
        int posicion;
        posicion = direccion(clave);
        if (tabla[posicion] != null){
            tabla[posicion].esAlta = false;
            System.out.println("Casa Rural (clave: " + clave + ") eliminada");
        }
        
        
    }

}
