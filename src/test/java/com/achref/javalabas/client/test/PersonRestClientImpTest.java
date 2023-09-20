package com.achref.javalabas.client.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.achref.javalabs.client.PersonRestClient;
import com.achref.javalabs.client.PersonRestClientImpl;
import com.achref.javalabs.client.builder.Builder;
import com.achref.javalabs.client.builder.PersonParamBuildImp;
import com.achref.javalabs.client.builder.PersonParamBuilder;
import com.achref.javalabs.client.config.Configuration;
import com.achref.javalabs.client.config.ConfigurationImpl;
import com.achref.javalabs.client.entities.Person;

public class PersonRestClientImpTest {

	
	private PersonRestClient personRestClient ; 
	private Configuration conf ; 
	@Before
	public void setUp() {
		conf = new ConfigurationImpl() ;
		conf.setBaseUrl("http://localhost:8084/");
		conf.setVersion("v1");
		conf.setComplementUrl("/person");
		personRestClient = new PersonRestClientImpl(conf) ;
	}
	@Test
	public void testGetAllPerson() {
		List<Person> persons = personRestClient.getAll() ;
	System.out.println(persons.size()); 
	assertTrue(  persons.size() == 6);
	
	}
@Test 
@Ignore
public void createPerson() {
	Person person = new Person() ; 
	person.setName("toto"); 
	person.setFamilyName("tata");
	person.setAdress("adresse");
	person.setMail("toto@gmail.com");
 Person createperson=	personRestClient.createPerson(person) ;
 assertTrue(createperson != null && "toto".equals(createperson.getName()));
}

public void testParams() {
	PersonParamBuilder params =new Builder().param1("achref").param2("achref").param3(44).build() ;
	List<Person> persons = personRestClient.getPerson(params) ;
	assertTrue(  persons.size() == 6);

			
}
	
}
