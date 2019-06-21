
package co.edu.utp.isc.pro4.exammaker.model;

import java.util.ArrayList;
import java.util.List;


public class Exam {
    
    private String name;
    private String description;
    private double maxGrade;
    private List<Question> questions;

    public Exam(String name, double maxGrade) {
        this.name = name;
        this.maxGrade = maxGrade;
        this.questions = new ArrayList();
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
