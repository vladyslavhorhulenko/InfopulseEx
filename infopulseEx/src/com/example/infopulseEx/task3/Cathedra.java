package com.example.infopulseEx.task3;


import java.util.ArrayList;

public class Cathedra extends EducationObject implements ITeachable{
    private ArrayList<Group> groups = new ArrayList<Group>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    public Cathedra(String name, ArrayList<Group> groups, ArrayList<Teacher> teachers) {
        super(name);
        setGroups(groups);
        setTeachers(teachers);
    }

    public Cathedra(String name, ArrayList<Group> groups) {
        super(name);
        setGroups(groups);
    }

    public Cathedra(String name) {
        super(name);
    }

    public Cathedra(){
        super();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        if(groups.size() >=1 ) {
            this.groups = groups;
        }
        else System.out.println("Error! List of groups is too short.");
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        if(teachers.size() >= 3) {
            this.teachers = teachers;
        }
    }

    @Override
    public String toString(){
        return String.format("\nCathedra: " + this.getName() + ", groups: " + this.getGroups() + ", teachers: " + this.getTeachers());
    }

    @Override
    public void Teach() {

    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof Cathedra)) {
            return false;
        }

        Cathedra c = (Cathedra) o;

        return this.getName().equals(c.getName()) && this.getTeachers().equals(c.getTeachers()) && this.getGroups().equals(c.getGroups());
    }
}
