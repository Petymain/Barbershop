package com.barbershop.Barbershop.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter

@Document(collection = "Haircut")
public class Haircut {
    private String name;
    private Float price;
    private String pictureURL;


    public Haircut(String name, Float price, String pictureURL) {
        this.name = name;
        this.price = price;
        this.pictureURL = pictureURL;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }


}