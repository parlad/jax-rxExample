/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.jax.rxexample.entity;

import com.neupane.jax.rxexample.DAO.Impl.StudentDAOImpl;
import com.neupane.jax.rxexample.DAO.StudentDAO;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentAPI {

    private StudentDAO stDao = new StudentDAOImpl();

    @GET
    @Produces("application/json")
    public List<Student> getAll() {
        return stDao.getAll();
    }

    @Path("/{id}")
    @GET
    public Student byId(@PathParam("id") int id, @QueryParam("token") String token) {
        if (token != null && !token.isEmpty()) {
            return stDao.getById(id);
        } else {
            return null;
        }
    }

    @Path("/save")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String save(@FormParam("name") String name) {
       return "hello mr." + name;
    }
}
