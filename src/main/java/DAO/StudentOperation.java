package DAO;

import Bean.Student;

import java.util.ArrayList;

public class StudentOperation implements StudentDeclaration {

    @Override
    public long insertStudent(Student st) {
        return 0;
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
