/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listaordenada;

/**
 *
 * @author usuario
 */
public class Lista {

    int[] listaOrdenada;
    int cantidadElementos;

    public Lista(int dimension) {
        listaOrdenada = new int[dimension];
        this.cantidadElementos = 0;
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public int[] getListaOrdenada() {
        return listaOrdenada;
    }

    public boolean buscar(int elemento) {
        int inicio = 0;
        int fin = cantidadElementos;
        while (fin >= inicio) {
            int posicion = (inicio + fin) / 2;
            if (listaOrdenada[posicion] == elemento) {
                return true;
            } else if (listaOrdenada[posicion] < elemento) {
                inicio = posicion + 1;
            } else if (listaOrdenada[posicion] > elemento) {
                fin = posicion - 1;
            }
        }
        return false;

    }

    public int buscarEntero(int elemento) {
        int inicio = 0;
        int fin = cantidadElementos - 1;
        int posicion = 0;
        while (fin >= inicio) {
            posicion = (inicio + fin) / 2;
            if (listaOrdenada[posicion] == elemento) {
                return -2;
            } else if (listaOrdenada[posicion] < elemento) {
                inicio = posicion + 1;
            } else if (listaOrdenada[posicion] > elemento) {
                fin = posicion - 1;
            }
        }
        if (listaOrdenada[posicion] < elemento) {
            return inicio;
        }
        return fin;
    }

    public boolean insertar(int elemento) {
        int pos = buscarEntero(elemento);
        if (pos != -2 && (cantidadElementos + 1) <= listaOrdenada.length) {
            for (int i = cantidadElementos - 1; i > pos; i--) {
                listaOrdenada[i + 1] = listaOrdenada[i];
            }
            listaOrdenada[pos] = elemento;
            cantidadElementos++;
            return true;
        }
        return false;
    }
}
