package com.omar.testapi.pojos;

public class Service {
    private int id;
    private String name;
    private String image;
    private String type;
    private float price;
    private String description;
    private int isAvailable;

    public Service(int id, String name, String image, String type, float price, String description, int isAvailable) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.type = type;
        this.price = price;
        this.description = description;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(int isAvailable) {
        this.isAvailable = isAvailable;
    }
}
