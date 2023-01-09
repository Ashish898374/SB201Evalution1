package Question1.Dao;

import Question1.Student;

public class FindById {
    public static void main(String[] args) {
        StudentDao stu=new StudentImpl();
        Student t=new Student();
       t= stu.findStudentById(2);
        System.out.println(t);
    }
}
