package academy.nelioalves.cursojava.domain.SFuncional.FuncaoParametro.Services;

import academy.nelioalves.cursojava.domain.RComparator.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum (List<Product> list, Predicate<Product> criteria) {
        double sum = 0;
        for (Product p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
    /*
    Desta forma como passei um predicado como argumento na função, ela fica fechada para modificações
    Caso a regra de negócio mude, a alteração será feita apenas no ponto do programa principal onde
    ela está.
     */
}
