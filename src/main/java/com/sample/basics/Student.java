package com.sample.basics;

class Student implements Comparable<Student>
{
    private String name;
    private int marks;
    private int number;


    Student(String name,int marks,int number)
    {
        this.name=name;
        this.marks=marks;
        this.number=number;
    }
    /**
     * @return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name+" "+this.marks+" "+this.number;
    }

    @Override
    public int compareTo(Student o) {
        if(o.getName().equals(this.name))
        {
            return -1;
        }
        else
          return 999;
    }
}