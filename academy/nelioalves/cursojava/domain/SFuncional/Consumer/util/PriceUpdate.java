package academy.nelioalves.cursojava.domain.SFuncional.Consumer.util;

import academy.nelioalves.cursojava.domain.RComparator.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
