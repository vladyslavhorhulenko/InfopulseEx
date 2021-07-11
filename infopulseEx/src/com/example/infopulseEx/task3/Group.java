package com.example.infopulseEx.task3;

import java.util.ArrayList;

public class Group extends EducationObject implements IStudyable{
    private ArrayList<Student> students = new ArrayList<Student>();
    private Teacher curator;
    private ArrayList<Subject> subjects = new ArrayList<Subject>();
    private double codeSpec;

    public Group(String name, ArrayList<Student> students, Teacher curator, ArrayList<Subject> subjects, double codeSpec) {
        super(name);
        setStudents(students);
        setCurator(curator);
        setSubjects(subjects);
        setCodeSpec(codeSpec);
    }

    public Group(String name, ArrayList<Student> students, Teacher curator, ArrayList<Subject> subjects) {
        super(name);
        setStudents(students);
        setCurator(curator);
        setSubjects(subjects);
    }

    public Group(String name, ArrayList<Student> students, Teacher curator) {
        super(name);
        setStudents(students);
        setCurator(curator);
    }

    public Group(String name, ArrayList<Student> students) {
        super(name);
        setStudents(students);
    }

    public Group(String name) {
        super(name);
    }

    public Group(){
        super();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        if(students.size() >= 6 && students.size() <= 30) {
            this.students = students;
        }
        else System.out.println("Error! Size of group is incorrect");
    }

    public Teacher getCurator() {
        return curator;
    }

    public void setCurator(Teacher curator) {
        this.curator = curator;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getCodeSpec() {
        return codeSpec;
    }

    public void setCodeSpec(double codeSpec) {
        if(codeSpec > 0) {
            this.codeSpec = codeSpec;
        }
        else System.out.println("Error! Code of speciality is incorrect");
    }

    @Override
    public String toString(){
        return String.format("\nGroup: " + this.getName() + "students: " + this.getStudents() + ", curator: " + this.getCurator() + ", subjects: " +
                this.getSubjects() + ", code of speciality: " + this.getCodeSpec());
    }

    @Override
    public void Study() {

    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if (!(o instanceof Group)) {
            return false;
        }

        Group c = (Group) o;

        return this.getName().equals(c.getName()) && this.getStudents().equals(c.getStudents()) && this.getCurator().equals(c.getCurator()) &&
                this.getSubjects().equals(c.getSubjects()) && Double.compare(this.getCodeSpec(), c.getCodeSpec()) == 0;
    }
}
