package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public String addItem(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        itemList.add(item);
        return "Item adicionado: " + item.getName() + " - Preço: " + item.getPrice() + " - Quantidade: " + item.getQuantity();
    }

    public void removeItem(String name) {
        List<Item> removeItens = new ArrayList<>();

        for (Item i : itemList) {
            if (i.getName().equalsIgnoreCase(name)) {
                removeItens.add(i);
            }
        }
        itemList.removeAll(removeItens);
    }

    public double calculateValueTotal() {
        double total = 0;

        for (Item i : itemList) {
            total += i.getPrice() * i.getQuantity();
        }
        total = Math.round(total * 100.0) / 100.0;
        System.out.println("O valor total dos itens é: " + total);

        return total;
    }

    public void showItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras buy = new CarrinhoDeCompras();

        String item1 = buy.addItem("Compra 1", 18.34, 6);
        System.out.println("A compra foi adicionada com sucesso\n" + item1);

        String item2 = buy.addItem("Compra 2", 200.46, 2);
        System.out.println("A compra foi adicionada com sucesso\n" + item2);

        String item3 = buy.addItem("Compra 3", 56.43, 7);
        System.out.println("A compra foi adicionada com sucesso\n" + item3);

        buy.removeItem("Compra 3");
        buy.showItens();

        buy.calculateValueTotal();
    }
}
