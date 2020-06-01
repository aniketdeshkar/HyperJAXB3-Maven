package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.example.model.CustomerType;
import com.example.model.Customers;
import com.example.model.Root;

public class TestClass {

	public static void main(String[] args) throws FileNotFoundException, JAXBException {
		TestClass t1 = new TestClass();
		t1.testXmlToObject();
	}
	
    public void testXmlToObject() throws JAXBException, FileNotFoundException {
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Customers");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	System.out.println(entityManager);
    	
        File file = new File("src/main/resources/CustomersOrdersInNamespace.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Root root = (Root) unmarshaller.unmarshal(file);
        //System.out.println(root.getCustomers());
        Customers customers = root.getCustomers();
        List<CustomerType> customer = customers.getCustomer();
        customer.forEach(q -> System.out.println(q.getCompanyName()));
    }
}
