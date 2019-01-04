package com.bindu.jaxrs.service;

import com.bindu.jaxrs.model.Person;
import com.bindu.jaxrs.model.Response;

public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}
