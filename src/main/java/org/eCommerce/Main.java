package org.eCommerce;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Deneme");
        System.out.println(product.getName());

        product.categoryCosmetics();

    }
}