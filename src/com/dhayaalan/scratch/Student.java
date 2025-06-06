package com.dhayaalan.scratch;

public class Student {

    
    private Integer number;

    public Student(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

class Main{
    public static void main(String[] args) {
        Student obj1 = new Student(10);
        Student obj2 = new Student(11);

        Student temp = obj1;
        obj1 = obj2;
        obj2 = temp;

        System.out.println(obj1.getNumber()+" "+obj2.getNumber());

        int a = 5, b = 6;
        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


}
