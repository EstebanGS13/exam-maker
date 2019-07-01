
package co.edu.utp.isc.pro4.exammaker.controller;

import co.edu.utp.isc.pro4.exammaker.model.Exam;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class FileController {
    
    private static FileController instance;

    public FileController() {
    }
    
    public static FileController getInstance() {
        if (instance == null) {
            instance = new FileController();
        }
        return instance;
    }
    
    public void saveNewExam(Exam exam) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("exam.cad"))) {
            out.writeObject(exam);
        } catch (Exception ex) {
            System.err.println("Error al escribir archivo: " + ex);
        }
    }
}
