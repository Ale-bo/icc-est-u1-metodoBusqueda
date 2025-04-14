public class App {
    private static final MetodosBusqueda mB = new MetodosBusqueda();
    public static void main(String[] args) throws Exception {
        int[] arreglo = {12, 8, 20, 34, 5};
        int valorBusqueda = 34;

        int resultado = mB.busquedaLieneal(arreglo, valorBusqueda);
        if (resultado != -1) {
            System.out.println("Valor encontrado en la posicion " + resultado);
        } else {
            System.out.println("Valor no encontrado");
        }
    }
}
