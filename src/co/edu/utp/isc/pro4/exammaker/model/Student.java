
package co.edu.utp.isc.pro4.exammaker.model;


public class Student {
    
    private String name;
    private String code;

    public Student(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private void solveExam() {
        //TODO implementar
    }
    
}
