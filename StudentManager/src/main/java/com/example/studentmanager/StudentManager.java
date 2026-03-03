/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.studentmanager;

/**
 *
 * @author Admin
 */

import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {

    
    private List<T> list;

    
    public  StudentManager() {
        list = new ArrayList<>();
    }

    
    public void add(T item) {
        list.add(item);
    }

    
    public List<T> getAll() {
        return list;
    }

}
