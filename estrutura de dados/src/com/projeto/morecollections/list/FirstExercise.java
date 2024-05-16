package com.projeto.morecollections.list;

import java.util.ArrayList;
import java.util.List;

public class FirstExercise {
    public static void main(String[] args) {
        CarrinhoDeCompras newList = new CarrinhoDeCompras();

        newList.addItem("tomate", 5.50, 2);
        newList.addItem("arroz", 11, 5);
        newList.addItem("feijao", 8.90, 2);
        newList.addItem("carne", 22.75, 1);
        newList.addItem("tomate", 5.50, 2);

        System.out.println(newList.calcTotalPrice());
        newList.printItems();

        newList.removeItem("tomate");

        newList.printItems();
    }
}

class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome: '" + nome + '\'' +
                ", preco: " + preco +
                ", quantidade: " + quantidade +
                '}';
    }
}

class CarrinhoDeCompras {
    private List<Item> itemsList;

    public CarrinhoDeCompras() {
        this.itemsList = new ArrayList<>();
    }

    public void addItem(String nome, double preco, int quantidade) {
        this.itemsList.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome) {
        List<Item> removingItem = new ArrayList<>();

        for (Item item: itemsList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removingItem.add(item);
            }
        }

        this.itemsList.removeAll(removingItem);
    }

    public double calcTotalPrice() {
        double totalItems = 0;

        for(int i = 0; i < this.itemsList.size(); i++) {
            double totalPrice = itemsList.get(i).getPreco();
            int totalQuant = itemsList.get(i).getQuantidade();

            totalItems += totalPrice * totalQuant;
        }

        return totalItems;
    }

    public void printItems() {
        System.out.println(this.itemsList);
    };
}

