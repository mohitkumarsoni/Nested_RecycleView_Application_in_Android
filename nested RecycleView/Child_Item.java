package com.example.nestedrecycleview;

public class Child_Item {
    String itemName, itemQty, itemPrice;
    int imageId;

    public Child_Item(String itemName, String itemQty, String itemPrice, int imageId) {
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
        this.imageId = imageId;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemQty() {
        return itemQty;
    }

    public void setItemQty(String itemQty) {
        this.itemQty = itemQty;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
