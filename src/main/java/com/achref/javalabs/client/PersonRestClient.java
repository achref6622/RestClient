/*package com.achref.javalabs.client;

import java.util.List;

import com.achref.javalabs.entities.Person;

import feign.Headers;
import feign.Param;
import feign.RequestLine;


@Headers("Accept: application/json")
public interface PersonRestClient {
	static final String POST ="POST" ;
	static final String GET ="GET" ;
	static final String PUT ="PUT" ;
	static final String DELETE ="DELETE" ;
	
	static final String CREATE_PERSON = POST +"/create" ;
	static final String UPDATE_PERSON = PUT +"/update/{id}" ;
	static final String GET_ALL_PERSON = GET +"/all" ;
	static final String DELETE_PERSON = PUT +"/delete/{id}" ;
	static final String GET_ALL_PERSON_BY_NAME = GET +"/all/by/name/{name}" ;
	static final String GET_ALL_PERSON_BY_FAMILY_NAME = GET +"/all/by/familyname/{familyname}" ;




	@Headers("Content-Type:application/json")
	@RequestLine(CREATE_PERSON)
	Person createPerson ( Person person) ; 
	@Headers("Content-Type:application/json")
	@RequestLine(UPDATE_PERSON)
	Person updatePerson ( Person person) ; 
	@RequestLine(DELETE_PERSON)
	void deletPerson (@Param(value="id") long id ) ; 
	
	@RequestLine(GET_ALL_PERSON)
	List<Person> getAll(); 
	
	@RequestLine(GET_ALL_PERSON_BY_NAME)
	List<Person> getByName (String name) ;
	
	@RequestLine(GET_ALL_PERSON_BY_FAMILY_NAME)
	List<Person> getByFamilyName(String familyName) ;
	
}
*/
package com.achref.javalabs.client;

import java.util.List;
import java.util.Map;

import com.achref.javalabs.client.builder.Builder;
import com.achref.javalabs.client.builder.PersonParamBuilder;
import com.achref.javalabs.client.entities.Person;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface PersonRestClient {
    
	static final String POST ="POST" ;
	static final String GET ="GET" ;
	static final String PUT ="PUT" ;
	static final String DELETE ="DELETE" ;
	
	static final String CREATE_PERSON = POST +" /create" ;
	static final String UPDATE_PERSON = PUT +" /update/{id}" ;
	static final String GET_ALL_PERSON = GET +" /all" ;
	static final String DELETE_PERSON = PUT +" /delete/{id}" ;
	static final String GET_ALL_PERSON_BY_NAME = GET +" /all/by/name/{name}" ;
	static final String GET_ALL_PERSON_BY_FAMILY_NAME = GET +" /all/by/familyname/{familyname}" ;
	static final String GET_PERSON = GET +" /all/params" ;

	
    @Headers("Content-Type: application/json")
    @RequestLine(CREATE_PERSON)
    Person createPerson(Person person);

    @Headers("Content-Type: application/json")
    @RequestLine(UPDATE_PERSON)
    Person updatePerson(@Param("id") long id, Person person);

    @RequestLine(DELETE_PERSON)
    void deletePerson(@Param("id") long id);

    @RequestLine(GET_ALL_PERSON)
    List<Person> getAll();

    @RequestLine(GET_ALL_PERSON_BY_NAME)
    List<Person> getByName(@Param("name") String name);

    @RequestLine(GET_ALL_PERSON_BY_FAMILY_NAME)
    List<Person> getByFamilyName(@Param("familyname") String familyName);
    
    //add it for test
    @RequestLine(GET_PERSON)
    List<Person> getPerson(@QueryMap PersonParamBuilder params);

}