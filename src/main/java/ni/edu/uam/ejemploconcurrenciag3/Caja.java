package ni.edu.uam.ejemploconcurrenciag3;

public class Caja {

    private int cantidadVentas = 0;
    private int totalRecaudado = 0;


    public synchronized void registrarVentas(String vendedor, int monto){
        cantidadVentas++;
        totalRecaudado += monto;
/*
syncrnized permite que solmente  un Thead (Hijo) ejecute el meto ala vez
 */
        System.out.println(vendedor + "registro una venta de  C$" + monto + "| ventas acumuladas:" +
                " " + cantidadVentas + " | total : C$" + totalRecaudado);
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }
}
