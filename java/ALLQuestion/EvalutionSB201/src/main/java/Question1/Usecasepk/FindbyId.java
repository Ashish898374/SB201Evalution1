package Question1.Usecasepk;

import Question1.Dao.UniversityDAO;
import Question1.Dao.UniversityDaoImpl;
import Question1.Student;

public class FindbyId {

    public static void main(String[] args) {
        UniversityDAO ud=new UniversityDaoImpl();
        Student st=ud.findStudentById(4);
        if(st==null){
            System.out.println("Student data not found...");
        }else {
            System.out.println(st);
        }
    }
}
