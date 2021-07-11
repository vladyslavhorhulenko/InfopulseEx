package com.example.infopulseEx.task3;

import java.util.ArrayList;
import java.util.List;

public class University extends EducationObject implements ITeachable{
    private int _level;
    private ArrayList<Faculty> faculties = new ArrayList<Faculty>();
    private ArrayList<Subject> subjects = new ArrayList<Subject>();

    public University(String name, int level, ArrayList<Faculty> faculties, ArrayList<Subject> subjects) {
        super(name);
        setLevel(level);
        setFaculties(faculties);
        setSubjects(subjects);
    }

    public University(String name, int level, ArrayList<Faculty> faculties) {
        super(name);
        setLevel(level);
        setFaculties(faculties);
    }

    public University(String name, int level){
        super(name);
        setLevel(level);
    }

    public University(String name){
        super(name);
    }

    public University(){
        super();
    }


    public int getLevel() {
        return _level;
    }

    public void setLevel(int _level) {
        if (_level >= 1 && _level <=4) {
            this._level = _level;
        }
        else System.out.println("Error. Incorrect level number!");
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString(){
        return String.format("\nUniversity: " + this.getName() + ", level: " + this.getLevel() + ", faculties" + this.getFaculties() +
                ", subjects: " + this.getSubjects());
    }

    @Override
    public void Teach() {

    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof University)) {
            return false;
        }

        University c = (University) o;

        return this.getName().equals(c.getName()) && Integer.compare(this.getLevel(), c.getLevel()) == 0 &&
                this.getSubjects().equals(c.getSubjects()) && this.getFaculties().equals(c.getFaculties());
    }
}
