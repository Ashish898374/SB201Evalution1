package Question1;

import Question1.Dao.StudentDao;
import Question1.Dao.StudentImpl;

public class DeleteData {
    public static void main(String[] args) {
        StudentDao studentDao=new StudentImpl();
        studentDao.deleteStudentById(1);
    }
}
