package ru.nigma.springcourse.dao;

import ru.nigma.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    private static int PEOPLE_COUNT=0;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(PEOPLE_COUNT++,"Tom"));
        people.add(new Person(PEOPLE_COUNT++,"Bob"));
        people.add(new Person(PEOPLE_COUNT++,"Mike"));
        people.add(new Person(PEOPLE_COUNT++,"Katy"));
    }

    public List<Person> index(){
        return people;
    }

    public  Person show(int id){

        return people.stream().filter(p->p.getId()==id).findAny().orElse(null);
    }
}
