package bean;

public class Teacher extends Person {


    private String teacherSubject;

    public Teacher(int age, String name, String surname, String teacherSubject){
        super.setAge(age);
        super.setName(name);
        super.setSurname(surname);
        this.teacherSubject = teacherSubject;
    }

    public Teacher(int age, String name, String surname){
        super.setAge(age);
        super.setName(name);
        super.setSurname(surname);
    }

    public Teacher(){

    }


    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    @Override
    public void tellWord(String word) {
        System.out.println(word);
    }

}
