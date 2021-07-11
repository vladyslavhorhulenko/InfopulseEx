package com.example.infopulseEx.task3;

public class Student extends Person implements IStudyable{
    public Student(){
        super();
    }

    public Student(String name, String surname, int age){
        super(name, surname, age);
    }

    @Override
    public void Study() {

    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof Student)) {
            return false;
        }

        Student c = (Student) o;

        return this.getName().equals(c.getName()) && this.getSurname().equals(c.getSurname()) && Integer.compare(this.getAge(), c.getAge()) == 0;
    }
}
