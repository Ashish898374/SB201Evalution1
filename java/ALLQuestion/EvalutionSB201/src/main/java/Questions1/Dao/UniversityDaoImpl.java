package Question1.Dao;

import Question1.Util.UtilConnection;
import Question1.Student;

import javax.persistence.EntityManager;


public class UniversityDaoImpl implements UniversityDAO {

    @Override
    public Student findStudentById(int id) {
        Student st=null;
        EntityManager em= UtilConnection.provideConnection();
        em.getTransaction().begin();
        st= em.find(Student.class,id);
        em.getTransaction().commit();
        em.close();
        return st;



    }

    @Override
    public String saveStudent(Student student) {

        EntityManager em= UtilConnection.provideConnection();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        String  msg="Student Data saved...";
        return msg;
    }

    @Override
    public String deleteStudentById(int id) {
        EntityManager em=UtilConnection.provideConnection();
        em.getTransaction().begin();
        Student student= em.find(Student.class,id);
        if(student==null){
            return "Student data not deleted...";
        }else{
            em.remove(student);
            em.getTransaction().commit();
            em.close();
            return "Student data deletd...";
        }
    }

    @Override
    public String updateStudentCGPA(int id, int cgpa) {
        EntityManager em=UtilConnection.provideConnection();
        em.getTransaction().begin();
        Student student= em.find(Student.class,id);
        if(student==null){
            return "data not updated";
        }
        else{
            student.setCgpa(cgpa);
            em.persist(student);
            em.getTransaction().commit();
            em.close();
            return "data updated...";
        }

    }
}

