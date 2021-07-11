package com.example.infopulseEx.task3;

import java.util.ArrayList;

public class Faculty extends EducationObject implements ITeachable{
    private ArrayList<Cathedra> cathedras = new ArrayList<Cathedra>();

    public Faculty(String name, ArrayList<Cathedra> cathedras) {
        super(name);
        setCathedras(cathedras);
    }

    public Faculty(String name){
        super(name);
    }

    public Faculty(){
        super();
    }

    public ArrayList<Cathedra> getCathedras() {
        return cathedras;
    }

    public void setCathedras(ArrayList<Cathedra> cathedras) {
        if(cathedras.size() >= 1) {
            this.cathedras = cathedras;
        }
        else System.out.println("Error! Too little list of cathedras!");
    }

    @Override
    public String toString(){
        return String.format("\nFaculty: " + this.getName() + ", cathedras: " + this.getCathedras());
    }

    @Override
    public void Teach() {

    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof Faculty)) {
            return false;
        }

        Faculty c = (Faculty) o;

        return this.getName().equals(c.getName()) && this.getCathedras().equals(c.getCathedras());
    }
}
