package com.star.demo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

/**
 * Created by Administrator on 2015/8/19.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "bookDemo")
public class Book {

    @XmlElement
    private int id;

    @XmlElement
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Book[id=%d,price=%f]", this.id, this.price);
    }
}