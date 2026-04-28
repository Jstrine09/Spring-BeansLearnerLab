package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    protected List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(PersonType person) {
        this.personList.add(person);
    }

    public void remove(PersonType person) {
        this.personList.remove(person);
    }
    
    public PersonType findById(long id) {
        for (PersonType person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    
    public int size() {
        return personList.size();
    }    

    public List<PersonType> getPersonList() {
        return personList;
    }

    public void addAll(Iterable<PersonType> people) {
    for (PersonType person : people) {
        this.personList.add(person);
        }
    }

    public void clear() {
        this.personList.clear();
    }

    public List<PersonType> findAll() {
        return this.personList;
    }

    public People(PersonType... people) {
    this.personList = new ArrayList<>(List.of(people));
    }

    @Override
    public java.util.Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
