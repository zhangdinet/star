package com.star.demo;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;

/**
 * Created by zhangdi on 2015/8/19.
 */
public class CustomerToXml {
    public static void main(String[] args) {
        try {

            Book book1 = new Book();
            book1.setId(1);
            book1.setPrice(1.1);

            Book book2 = new Book();
            book2.setId(2);
            book2.setPrice(2.2);

            Set<Book> bookSet = new HashSet<Book>();
            bookSet.add(book1);
            bookSet.add(book2);

            Customer customer = new Customer();
            customer.setAge(13);
            customer.setName("sweet");
            customer.setBookSet(bookSet);
            File file = new File("D:/customer.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(customer, file);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Customer customer1 = (Customer) unmarshaller.unmarshal(file);
            System.out.println(customer1);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}