/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Student;
import repository.StudentRepositoy;
import java.util.ArrayList;

/**
 *
 * @author DiepTCNN
 */
public class StudentInfoManager {
    StudentRepositoy program;
    ArrayList<Student> lt;

    public StudentInfoManager() {
        program = new StudentRepositoy();
        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\nCollection Sort Program");
        program.display(lt);
    }
}
