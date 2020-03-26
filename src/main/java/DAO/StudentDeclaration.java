package DAO;

import Bean.Student;

import java.util.ArrayList;

public interface StudentDeclaration {
    long insertStudent(Student st);
    long upDate(long id,Student st);
    boolean delete(long id);
    Student selectStudent(long id);
    ArrayList selectAllStudents();
    ArrayList searchByName(String name);
}
