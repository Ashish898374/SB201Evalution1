package Question1.Usecasepk;

import Question1.Dao.UniversityDAO;
import Question1.Dao.UniversityDaoImpl;

public class Update {
    public static void main(String[] args) {
        UniversityDAO ud=new UniversityDaoImpl();
        String msg=ud.updateStudentCGPA(5,2034);
        System.out.println(msg);
    }
}
