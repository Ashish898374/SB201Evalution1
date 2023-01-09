package Question1.Usecasepk;

import Question1.Dao.UniversityDAO;
import Question1.Dao.UniversityDaoImpl;
import Question1.Student;

public class Save {
    public static void main(String[] args) {
        Student st=new Student();
        st.setEmail("Ashishyadavbhai@gmail.com");
        st.setAddress("Maharastra");
        st.setCgpa(32);
        UniversityDAO ud=new UniversityDaoImpl();
        String msg=ud.saveStudent(st);
        System.out.println(msg);
    }
}
