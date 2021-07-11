package com.example.infopulseEx.task3;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 1) {
            this.name = name;
        }
        else System.out.println("Error. Name is too short!");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.length() >= 1) {
            this.surname = surname;
        }
        else System.out.println("Error. Surname is too short!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1){
            this.age = age;
        }
        else System.out.println("Error. Too little age");
    }

    @Override
    public String toString(){
        return String.format("\nName: " + this.getName() + ", surname: " + this.getSurname() + ", age: " + this.getAge());
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }

        Person c = (Person) o;

        return this.getName().equals(c.getName()) && this.getSurname().equals(c.getSurname()) && Integer.compare(this.getAge(), c.getAge()) == 0;
    }
}
