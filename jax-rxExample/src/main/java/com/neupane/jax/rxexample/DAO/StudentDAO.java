/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.jax.rxexample.DAO;

import com.neupane.jax.rxexample.entity.Student;
import java.util.List;

/**
 *
 * @author parlad
 */
public interface StudentDAO {

    List<Student> getAll();

    Student getById(int id);
}
