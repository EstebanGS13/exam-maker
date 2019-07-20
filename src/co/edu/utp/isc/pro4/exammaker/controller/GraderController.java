
package co.edu.utp.isc.pro4.exammaker.controller;

import co.edu.utp.isc.pro4.exammaker.model.Exam;
import co.edu.utp.isc.pro4.exammaker.model.Question;
import co.edu.utp.isc.pro4.exammaker.model.QuestionMultipleAnswer;
import co.edu.utp.isc.pro4.exammaker.model.QuestionOpenAnswer;
import co.edu.utp.isc.pro4.exammaker.model.QuestionUniqueAnswer;
import java.util.ArrayList;
import java.util.List;


public class GraderController {
    
    private static GraderController instance;
    private Exam exam;
    private double grade = 0;
    private List <Question> openAnswersToGrade = new ArrayList();

    public GraderController() {
    }
    
    public static GraderController getInstance() {
        if (instance == null) {
            instance = new GraderController();
        }
        return instance;
    }

    public void loadSolvedExam() {
        this.exam = FileController.getInstance().loadExam("solved_exam.cad");
    }

    public void checkAnswers() {
        for (Question question : exam.getQuestions()) {
            switch(question.getType()) {
                case OPEN:
                    openAnswersToGrade.add((QuestionOpenAnswer) question);
                    break;
                case UNIQUE:
                    if (((QuestionUniqueAnswer) question).getChosenOptionIndex()
                            == ((QuestionUniqueAnswer) question).getCorrectOptionIndex()) {
                        this.grade += question.getValue();
                    }
                    break;
                case MULTIPLE:
                    boolean correct = true;
                    for (Integer index : ((QuestionMultipleAnswer) question)
                            .getChosenOptionsIndexes()) {
                        if (!((QuestionMultipleAnswer) question)
                                .getCorrectOptionsIndexes().contains(index)) {
                            correct = false;
                        } 
                    }
                    if (correct) {
                        this.grade += question.getValue();
                    }
            }
        }
        System.out.println("Nota preeliminar: " + this.grade);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public List<Question> getOpenAnswersToGrade() {
        return openAnswersToGrade;
    }
    
    
}
