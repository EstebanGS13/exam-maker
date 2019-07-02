
package co.edu.utp.isc.pro4.exammaker.controller;

import co.edu.utp.isc.pro4.exammaker.model.Exam;
import co.edu.utp.isc.pro4.exammaker.model.Question;
import co.edu.utp.isc.pro4.exammaker.model.QuestionMultipleAnswer;
import co.edu.utp.isc.pro4.exammaker.model.QuestionOpenAnswer;
import co.edu.utp.isc.pro4.exammaker.model.QuestionType;
import co.edu.utp.isc.pro4.exammaker.model.QuestionUniqueAnswer;
import java.util.List;


public class ExamController {
    
    private static ExamController instance;
    private Exam exam;

    public ExamController() {
    }
    
    public static ExamController getInstance() {
        if (instance == null) {
            instance = new ExamController();
        }
        return instance;
    }
    
    public void createExam(String name, String description, double maxGrade) {
        this.exam = new Exam(name, description, maxGrade);
    }

    public void addQuestionOpenAnswer(QuestionType questionType, String statement, 
            double value) {
        QuestionOpenAnswer question = new QuestionOpenAnswer(questionType, statement, value);
        this.exam.getQuestions().add(question);
    }

    public void addQuestionUniqueAnswer(QuestionType questionType, String statement, 
            double value, List<String> options, int correctOption) {
        QuestionUniqueAnswer question = new QuestionUniqueAnswer(questionType, statement, value);
        question.setOptions(options);
        question.setCorrectOptionIndex(correctOption);
        this.exam.getQuestions().add(question);   
    }
    
    public void addQuestionMultipleAnswer(QuestionType questionType, String statement, 
            double value, List<String> options, List<Integer> correctOptions) {
        QuestionMultipleAnswer question = new QuestionMultipleAnswer(questionType, statement, value);
        question.setOptions(options);
        question.setCorrectOptionsIndexes(correctOptions);
        this.exam.getQuestions().add(question);
    }

    public void saveExam() {
        FileController.getInstance().saveExam(this.exam, "exam.cad");
    }
    
    public void test() {
        for (Question q : this.exam.getQuestions()) {
            System.out.println(q);
        }
    }

    
    
}
