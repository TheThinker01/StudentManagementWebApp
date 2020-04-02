package DAO;

import Bean.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentDeclaration {
    long insertStudent(Student st);
    long upDate(long id,Student st);
    boolean delete(long id);
    Student selectStudent(long id);
    List selectAllStudents();
    List searchByName(String name);
}
