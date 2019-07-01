
package co.edu.utp.isc.pro4.exammaker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Exam implements Serializable {
    
    private String name;
    private String description;
    private double maxGrade;
    private List<Question> questions;

    public Exam(String name, String description, double maxGrade) {
        this.name = name;
        this.description = description;
        this.maxGrade = maxGrade;
        this.questions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getMaxGrade() {
        return maxGrade;
    }

    public List<Question> getQuestions() {
        return questions;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxGrade(double maxGrade) {
        this.maxGrade = maxGrade;
    }
    
}
