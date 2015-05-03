package com.ulotrix.spring.dao;


import com.ulotrix.spring.model.Person;

import java.util.List;

public interface PersonDAO {

    public void addPerson(Person p);
    public void updatePerson(Person p);
    public void removePerson(int id);
    public List<Person> listPersons();
    public Person getPersonById(int id);

}
