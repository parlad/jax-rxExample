/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.jax.rxexample.DAO.Impl;

import com.neupane.jax.rxexample.DAO.StudentDAO;
import com.neupane.jax.rxexample.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author parlad
 */
public class StudentDAOImpl implements StudentDAO {

    private List<Student> studList = new ArrayList<>();

    @Override
    public List<Student> getAll() {
        studList.add(new Student(1, "pralad neupane", "sgdsghd", "sahdfsh", true));
        studList.add(new Student(2, "sanjeev neupane", "sgdsghd", "sahdfsh", true));
        return studList;
    }

    @Override
    public Student getById(int id) {
        for (Student s : getAll()) {
            if (s.getId() == id) {
                return s;

            }
        }
        return null;
    }

}
