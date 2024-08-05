package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegisterProducts {
    Set<Product> productSet;

    public RegisterProducts() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int quantity) {
        productSet.add(new Product(code, name, price, quantity));
    }

    public Set<Product> showProductsByName() {
        Set<Product> productByName = new TreeSet<>(productSet);

        return productByName;
    }

    public Set<Product> showProductsByPrice() {
        Set<Product> productByPrice = new TreeSet<>(new ComparatorByPrice());
        productByPrice.addAll(productSet);

        return productByPrice;
    }

    public static void main(String[] args) {
        RegisterProducts register = new RegisterProducts();

        register.addProduct(1L, "Produto 1", 18d, 9);
        register.addProduct(2L, "Produto 2", 13d, 6);
        register.addProduct(1L, "Produto 3", 10d, 23);
        register.addProduct(3L, "Produto 4", 7d, 10);

        System.out.println(register.productSet);

        System.out.println(register.showProductsByName());

        System.out.println(register.showProductsByPrice());
    }

}
