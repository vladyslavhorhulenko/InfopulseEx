package com.example.infopulseEx.task3;

import java.util.ArrayList;

public class Teacher extends Person implements ITeachable{
    private ArrayList<Subject> subjects = new ArrayList<Subject>();
    public Teacher(){
        super();
    }

    public Teacher(String name, String surname, int age){
        super(name, surname, age);
    }

    public Teacher(String name, String surname, int age, ArrayList<Subject> subjects){
        super(name, surname, age);
        setSubjects(subjects);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public void Teach() {

    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof Teacher)) {
            return false;
        }

        Teacher c = (Teacher) o;

        return this.getName().equals(c.getName()) && this.getSurname().equals(c.getSurname()) && Integer.compare(this.getAge(), c.getAge()) == 0
                && this.getSubjects().equals(c.getSubjects());
    }
}
