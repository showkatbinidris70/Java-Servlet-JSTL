/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.controller;

import com.coderbd.model.Student;

/**
 *
 * @author User
 */

public class StudentController {
    private Student student;

   public void save(){
       System.out.println(student);
   }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
}
