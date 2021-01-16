package es.iessaladillo.pedrojoya.shops;

import java.util.Scanner;

// El objetivo de nuestra práctica es a partir de un producto introducido
// por teclado, calcular de manera asíncrona el precio de dicho producto en
// todas las tiendas de una determinada red de tiendas, mostrar dichos precios
// y mostrar finalmente el tiempo total que se ha tardado en realizar la búsqueda.
public class Main {

    private final ShopNetwork shopNetwork;
    private long startTime;

    public static void main(String[] args) {
        new Main(new ShopNetwork(new DiscountService()));
    }

    public Main(ShopNetwork shopNetwork) {
        this.shopNetwork = shopNetwork;
        calculatePriceOfProduct();
    }

    private void calculatePriceOfProduct() {
        System.out.print("Product to search: ");
        Scanner keyboard = new Scanner(System.in);
        String product = keyboard.nextLine();
        startTime = System.nanoTime();
        search(product);
        System.out.printf("Search took %d ms", (System.nanoTime() - startTime) / 1000000);
    }

    // TODO: Obtenemos el Stream con los CompletableFuture que representan las consultas
    //  del producto a cada una de las tiendas.
    //  Cuando termina cada consulta se muestra el resultado por consola.
    //  Finalmente se recolecta el stream en un array de CompletableFuture,
    //  para que podamos esperar a que se completen (terminen de ejecutarse) todos ellos,
    //  Como CompletableFuture.allOf() recibe un vararg podemos pasarle un array.
    private void search(String product) {
        // ..
    }

}
