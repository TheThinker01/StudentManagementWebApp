package DAO;

import Bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import HelpingClasses.*;
import org.hibernate.query.Query;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentOperation implements StudentDeclaration {
//TODO : Implement these functions
    SessionFactory sf;
    Session session;
    Transaction tr;

    public StudentOperation()
    {
        sf = SessionFact.getSessionFact();
        session = sf.openSession();
    }

    @Override
    public long insertStudent(Student st) {
        tr= session.beginTransaction();
        long l = (Long) session.save(st);
        tr.commit();
        if(l>0)
        {
            return l;
        }
        else {
            return 0;
        }
    }

    @Override
    public long upDate(long id, Student st) {
        st.setS_id(id);// Set the id
        tr = session.beginTransaction();
        session.update(st);// Update the DB data having same id as st
        tr.commit();// Commit the transaction
        return 1;// Have to do some validation here , regarding username etc .
    }

    @Override
    public boolean delete(long id) {
        try{
            tr = session.beginTransaction();
            Student student = session.get(Student.class,id);
            session.delete(student);
            tr.commit();
            return true;
        }catch (Exception e)
        {
            if(tr!=null)
                tr.rollback();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Student selectStudent(long id) {
        Query query = session.createQuery("from Student where s_id=:id");
        query.setLong("id", id);
        List lis = query.list();
        ListIterator listIterator = lis.listIterator();
        Student res = (Student) listIterator.next();
        return res;
    }

    @Override

    public List selectAllStudents() {
        tr= session.beginTransaction();
        List res = session.createQuery("from Student").list();
        if(res.size()>0)
            return res;
        else
            return null;
    }

    @Override
    public List searchByName(String name) {
        if (name == null) {
            List res = selectAllStudents();
            return res;
        }
        else {
            Query query = session.createQuery("from Student where name like :searchfield");
            query.setString("searchfield", "%"+name+"%");
            List lis = query.list();
            return lis;
        }
    }


    public  static  void  main(String[] arg){
        StudentOperation  sts = new StudentOperation();

       Student stud = sts.selectStudent(2);
       System.out.println(stud.getName()+"    "+stud.getAddress());
    }
}
