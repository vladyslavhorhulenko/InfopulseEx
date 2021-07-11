package com.example.infopulseEx.task3;

public class EducationObject {
    private String name;

    public EducationObject(String name){
        setName(name);
    }

    public EducationObject(){

    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        if(_name.length() >= 1) {
            this.name = _name;
        }
        else System.out.println("Error. Incorrect name!");
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof EducationObject)) {
            return false;
        }

        EducationObject c = (EducationObject) o;

        return this.getName().equals(c.getName());
    }
}
