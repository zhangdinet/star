package com.star.demo;

import java.util.Set;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * Created by zhangdi on 2015/8/19.
 */

@XmlRootElement(name = "customerDemo")
public class Customer {

    private String name;
    private int age;
    private Set<Book> bookSet;

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElementWrapper(name = "bookSet")
    @XmlElement(name = "book")
    public Set<Book> getBookSet() {
        return bookSet;
    }


    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    @Override
    public String toString() {
        return String.format("Customer[age=%d,name=%s,bookSet=%s]", this.age, this.name, this.bookSet);
    }

}