package es.iessaladillo.pedrojoya.shops;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

// Red de tiendas en las que se puede buscar el precio de un producto.
public class ShopNetwork {

    private final DiscountService discountService;
    // Lista de tiendas con las que trabaja la red de tiendas
    private final List<Shop> shops = Arrays.asList(
            new Shop("BuyItAll"),
            new Shop("MyFavoriteShop"),
            new Shop("LetsSaveBig"),
            new Shop("ShopEasy"),
            new Shop("BestPrice"));
    // Ejecutor en el que deben ejecutarse las operaciones asíncronas.
    private final Executor executor = Executors.newFixedThreadPool(shops.size());

    // El constructor recibe el servicio de descuentos con el que trabaja la red de tiendas
    public ShopNetwork(DiscountService discountService) {
        this.discountService = discountService;
    }

    // TODO: Crea este método de manera que retorna un Stream, de manera que para
    //  cada tienda se consulte de manera asíncrona el precio del producto,
    //  después se parsee la cadena recibida obteniendo un objeto ShopResponse,
    //  y finalmente se le aplique el descuento correspondiente (teniendo en cuenta que este proceso
    //  es costoso en tiempo y por tanto debería ejecutarse de forma asíncrona en otro hilo)
    public Stream<CompletableFuture<String>> findPricesStream(String product) {
        // ...
    }

}
