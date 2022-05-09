package bean;

public class Student extends Person{
    private String studentClass;

    public Student(int age, String name, String surname, String studentClass){
        super.setAge(age);
        super.setName(name);
        super.setSurname(surname);
        this.studentClass = studentClass;
    }

    public Student(int age, String name, String surname){
        super.setAge(age);
        super.setName(name);
        super.setSurname(surname);
    }

    public Student(){

    }


    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
    @Override
    public void tellWord(String word) {
        System.out.println(word);
    }
}
