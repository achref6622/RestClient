package com.achref.javalabs.client;

import java.util.List;
import java.util.Map;

import com.achref.javalabs.client.builder.Builder;
import com.achref.javalabs.client.builder.PersonParamBuilder;
import com.achref.javalabs.client.config.Configuration;
import com.achref.javalabs.client.entities.Person;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class PersonRestClientImpl implements PersonRestClient {
    private PersonRestClient personRestClient;

    private  String baseUrl ;
    private Configuration configuration ;
    public PersonRestClientImpl(Configuration config) {
    	this.configuration=config ;
    	initBaseUrl();
        personRestClient = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PersonRestClient.class, baseUrl);
    }
    public void initBaseUrl() {
    	baseUrl = configuration.getBaseUrl() + configuration.getVersion() + configuration.getComplementUrl() ;
    }
    public Person createPerson(Person person) {
        return personRestClient.createPerson(person);
    }

    public Person updatePerson(long id ,Person person) {
        return personRestClient.updatePerson(id, person) ;
    }

    public void deletePerson(long id) {
        personRestClient.deletePerson(id);
    }

    public List<Person> getAll() {
        return personRestClient.getAll();
    }

    public List<Person> getByName(String name) {
        return personRestClient.getByName(name);
    }

    public List<Person> getByFamilyName(String familyName) {
        return personRestClient.getByFamilyName(familyName);
    }
	public List<Person> getPerson(PersonParamBuilder params) {
		// TODO Auto-generated method stub
		return personRestClient.getPerson(params);
	}
}
