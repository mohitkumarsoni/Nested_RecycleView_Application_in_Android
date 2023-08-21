package com.example.nestedrecycleview;

public class Parent_Item {
    String orderId,quantity,price;
    int imageId;


    public Parent_Item(String orderId, String quantity, String price, int imageId) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.price = price;
        this.imageId = imageId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
