
package co.edu.utp.isc.pro4.exammaker.model;


public class Professor {
    
    private String name;
    private String id;

    public Professor(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    private void createExam() {
        //TODO implementar
    }
    
    private void gradeExam() {
        //TODO implementar
    }
    
}
