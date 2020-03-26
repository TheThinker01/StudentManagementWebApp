package DAO;

import Bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import HelpingClasses.*;
import java.util.ArrayList;

public class StudentOperation implements StudentDeclaration {
//TODO : Implement these functions
    SessionFactory sf;
    Session ss;
    Transaction tr;

    public StudentOperation()
    {
        sf = SessionFact.getSessionFact();
        ss = sf.openSession();
    }

    @Override
    public long insertStudent(Student st) {
        tr= ss.beginTransaction();
        long l = (Long)ss.save(st);
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
        return 0;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Student selectStudent(long id) {
        return null;
    }

    @Override
    public ArrayList selectAllStudents() {
        return null;
    }

    @Override
    public ArrayList searchByName(String name) {
        return null;
    }
}
