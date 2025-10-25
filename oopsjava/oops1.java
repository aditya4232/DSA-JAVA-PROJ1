package oopsjava;

public class oops1 {

    static class Student {
        String name;
        int age;

        Student(String name){
            this.name = name;
        }
    }

    public static void main(String args[]) {

        Student s1 = new Student("Aditya");
        System.out.print(s1.name);


    }
    
    
    
}
