/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vize2;

import java.util.ArrayList;

/**
 *
 * @author habee
 */
public class Product {
    
    private ArrayList<Product> products;
    
    private String name;
    private double price;
    private double orginalPrice;
    private int quantity;
    private String description;

    public Product(String name, String description, double price) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity=1;
        this.orginalPrice=price;
    }
    
    public Product(String name, int qunatity) {
        this.name = name;
        this.quantity=quantity;
    }
    
    public Product() {
        this.products = new ArrayList<>();
    }

    public void AddProduct(String name, String description, double price){
        products.add(new Product(name, description, price));
    }
    
    public void AddProduct(String name, int quantity){
        products.add(new Product(name, quantity));
    }
    
    public void RemoveAllProducts(){
        products.clear();
    }
    
    public void removeproduct(int product){
        products.remove(product);
    }
    
    public void getProductbyName(int product){
        products.get(product).getName();
    }
    
    
    public int ProductsLength(){
        return products.size();
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;            
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOrginalPrice() {
        return orginalPrice;
    }

    public void setOrginalPrice(double orginalPrice) {
        this.orginalPrice = orginalPrice;
    }
    
    
    public ArrayList<Product> getProducts() {
        return products;
    }
            

}


