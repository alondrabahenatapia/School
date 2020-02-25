public class Section {
    //Properties
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;
    // Constructor
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher t){
        this.teacher = t;
    }
    public Student[] getStudents() {
        return students;
    }
    public void addStudent(Student s) {
        students[currentSize] = s;
        currentSize++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Section(String name) {
        this.name = name;
    }


    public String  toString(){
        return name + " is taught by "
        + teacher + " and has "
        + currentSize + " students: "
        + buildStudents();
    }

    public String buildStudents() {

        String eachStudent = "";
        for(int i = 0; i < currentSize; i++) {
            eachStudent += students[i].getName() + " ,";
        }
        return eachStudent;

    }

}




                                             

