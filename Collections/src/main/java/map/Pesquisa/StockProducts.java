package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class StockProducts {
    Map<Long, Product> productMap;

    public StockProducts() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(long code, String name, int quantity, double price) {
        productMap.put(code, new Product(name, price, quantity));
    }

    public void showProduct() {
        System.out.println(productMap);
    }

    public double calculateValueTotalStock() {
        double totalValueInStock = 0d;

        if(!productMap.isEmpty()) {
            for (Product p : productMap.values()) {
                totalValueInStock += p.getQuantity() * p.getPrice();
            }
        }
        return totalValueInStock;
    }

    public Product getProductMoreExpensive() {
        Product productMoreExpensive = null;
        double morePrice = Double.MIN_VALUE;

        if(!productMap.isEmpty()) {
            for (Product p : productMap.values()) {
                if (p.getPrice() > morePrice) {
                    productMoreExpensive = p;
                    morePrice = p.getPrice();
                }
            }
        }
        return productMoreExpensive;
    }

    public Product getProductMoreCheap() {
        Product productMoreCheap = null;
        double smallerPrice = Double.MAX_VALUE;

        if (!productMap.isEmpty()) {
            for (Product p : productMap.values()) {
                if (p.getPrice() < smallerPrice) {
                    productMoreCheap = p;
                    smallerPrice = p.getPrice();
                }
            }
        }
        return productMoreCheap;
    }

    public Product getProductMoreQuantityTotalInStock() {
        Product productMoreQuantity = null;
        double maxProductValueTotal = Double.MIN_VALUE;

        if (!productMap.isEmpty()) {
            for (Product p : productMap.values()) {
                double valueTotal = p.getQuantity() * p.getPrice();
                if (valueTotal > maxProductValueTotal) {
                    maxProductValueTotal = valueTotal;
                    productMoreQuantity = p;
                }
            }
        }
        return productMoreQuantity;
    }

    public static void main(String[] args) {
        StockProducts stockProducts = new StockProducts();

        stockProducts.showProduct();

        stockProducts.addProduct(1L, "Product A", 10, 5.0);
        stockProducts.addProduct(2L, "Product B", 8, 10.0);
        stockProducts.addProduct(3L, "Product C", 2, 15.0);
        stockProducts.addProduct(8L, "Product D", 2, 20.0);

        stockProducts.showProduct();

        System.out.println("Valor total de produtos do estoque: R$" + stockProducts.calculateValueTotalStock());
        System.out.println("Produto mais caro: " + stockProducts.getProductMoreExpensive());
        System.out.println("Produto mais barato: " + stockProducts.getProductMoreCheap());
        System.out.println("Produto com maior quantidade de valor no estoque: " + stockProducts.getProductMoreQuantityTotalInStock());
    }
}
