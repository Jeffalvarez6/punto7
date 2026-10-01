public class ColaClientesPrioridad {
    private Cola ocasionales;
    private Cola asiduos;
    private int nOcasionales;
    private int nAsiduos;

    public ColaClientesPrioridad() { // (a) Crear cola vacía[cite: 102]
        ocasionales = new Cola();
        asiduos = new Cola();
        nOcasionales = 0;
        nAsiduos = 0;
    }

    // (b) Añadir elemento especificando si es asiduo u ocasional[cite: 102]
    public void agregar(Object cliente, boolean esAsiduo) {
        if (esAsiduo) {
            asiduos.agregar(cliente);
            nAsiduos++;
        } else {
            ocasionales.agregar(cliente);
            nOcasionales++;
        }
    }

    // (c) Consultar primer elemento atendiendo la prioridad[cite: 102]
    public Object consultarPrimero() {
        if (!asiduos.estaVacia()) {
            return asiduos.tomar();
        }
        return ocasionales.tomar();
    }
    // (d) Eliminar primer elemento según prioridad
    public void eliminarPrimero() {
        if (!asiduos.estaVacia()) {
            asiduos.eliminar();
            nAsiduos--;
        } else if (!ocasionales.estaVacia()) {
            ocasionales.eliminar();
            nOcasionales--;
        }
    }

    // (e) Consultar número de clientes ocasionales
    public int cantidadOcasionales() {
        return nOcasionales;
    }

    // (f) Consultar número de clientes asiduos
    public int cantidadAsiduos() {
        return nAsiduos;
    }

    // (g) Consultar si está vacía la cola completa
    public boolean estaVacia() {
        return nAsiduos == 0 && nOcasionales == 0;
    }
}