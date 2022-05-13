package Exam;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Student2 {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private Student1 student1;

    public Student2(){
        student1 = new Student1();
        studentList = student1.water();
    }
    public void add() throws IOException {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String lastName = inputLastName();
        Byte age = inputAge();
        Student student = new Student("id",lastName,Integer.parseInt(String.valueOf(age)));
        studentList.add(student);
        student1.doc(studentList);
    }

    public void show() {
        for (Student student : studentList) {
            System.out.format("%5d | ", student.getEnrollID());
            System.out.format("%20s | ", student.getLastName());
            System.out.format("%5d | ", student.getAge());

        }
    }
    public int inputId() {
        System.out.print(" Student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print(" Student id again: ");
            }
        }
    }

    private byte inputAge() {
        System.out.print("Input student age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    private String inputLastName() {
        System.out.println("Student Last: ");
        return scanner.nextLine();
    }
    public List<Student> getStudentList(){
        return studentList;
    }
    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }


}
