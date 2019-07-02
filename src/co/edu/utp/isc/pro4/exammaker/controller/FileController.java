
package co.edu.utp.isc.pro4.exammaker.controller;

import co.edu.utp.isc.pro4.exammaker.model.Exam;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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
    
    public void saveExam(Exam exam, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            out.writeObject(exam);
        } catch (Exception ex) {
            System.err.println("Error al escribir archivo: " + ex);
        }
    }
    
    public Exam loadExam(String fileName) {
        Exam exam = null;
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(fileName))) {
            boolean cont = true;
            while (cont) {
                Object readObject = in.readObject();
                if (readObject != null && readObject instanceof Exam) {
                    exam = (Exam) readObject;
                } else {
                    cont = false;
                }
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return exam;
    }
}
