package com.example.infopulseEx.task3;

public class Subject extends EducationObject{

    public Subject(String name){
        super(name);
    }

    public Subject(){
        super();
    }

    @Override
    public String toString(){
        return  String.format("\nSubject: " + this.getName());
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof Subject)) {
            return false;
        }

        Subject c = (Subject) o;

        return this.getName().equals(c.getName());
    }
}
