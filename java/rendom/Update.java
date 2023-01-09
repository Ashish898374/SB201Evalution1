package Question1;

import Question1.Dao.StudentDao;
import Question1.Dao.StudentImpl;

public class Update {
    public static void main(String[] args) {
        StudentDao t=new StudentImpl();
        t.updateStudentCGPA(2,5556);
        System.out.println(t);
    }
}
