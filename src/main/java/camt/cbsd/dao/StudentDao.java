package camt.cbsd.dao;

import camt.cbsd.entity.Student;

import java.util.List;

/**
 * Created by CAMT on 3/24/2017.
 */
public interface StudentDao {
    List<Student> getStudents();
    Student findById(long id);
}
