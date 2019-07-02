
package co.edu.utp.isc.pro4.exammaker.controller;

import co.edu.utp.isc.pro4.exammaker.model.Exam;


public class SolverController {
    
    private static SolverController instance;
    private Exam exam;

    public SolverController() {
    }
    
    public static SolverController getInstance() {
        if (instance == null) {
            instance = new SolverController();
        }
        return instance;
    }

    public Exam getExam() {
        return exam;
    }
    
    public void loadExam() {
        this.exam = FileController.getInstance().loadExam("exam.cad");
    }
    
    public void saveSolvedExam() {
        FileController.getInstance().saveExam(this.exam, "solved_exam.cad");
    }
}
