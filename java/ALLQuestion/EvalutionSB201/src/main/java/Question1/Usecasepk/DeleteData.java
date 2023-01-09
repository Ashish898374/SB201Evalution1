package Question1.Usecasepk;

import Question1.Dao.UniversityDAO;
import Question1.Dao.UniversityDaoImpl;

public class DeleteData {
    public static void main(String[] args) {
        UniversityDAO ud=new UniversityDaoImpl();
        String msg=ud.deleteStudentById(3);
        System.out.println(msg);
    }
}
