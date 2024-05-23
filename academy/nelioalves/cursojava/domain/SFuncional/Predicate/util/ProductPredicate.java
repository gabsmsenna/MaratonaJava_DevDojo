package academy.nelioalves.cursojava.domain.SFuncional.Predicate.util;

import academy.nelioalves.cursojava.domain.RComparator.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
