package MVCPatternExample;

public class MVCPatternTest {
    public static void main(String[] args) {
        
        Student model = new Student("1", "Hari", "A");    
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
       
        controller.setStudentName("Hari");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
