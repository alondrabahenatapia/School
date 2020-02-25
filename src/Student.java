public class Student extends Person {
    //Properties
    private int grade;
    private int sectionCount = 0;
    private Section[] sections = new Section[10];


    //Constructor
    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    //Methods
    public int getGrade() {

        return grade;
    }
    public void setGrade(int grade){

        this.grade = grade;
    }

    public int getSectionCount() {

        return sectionCount;
    }
    public Section[] getSections() {

        return sections;
    }
    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }
    public String toString(){
        return getName() + " is in " + grade +
        " grade and is enrolled in the following sections " +
        sectionTeacher() ;
    }
    public String sectionTeacher(){
        String sectea = "";
        for(int i=0; i<sectionCount;i++){
            sectea += sections[i].getName() + ", ";

        }
        return sectea;
    }
    public String teach(){
        String name = "";
        for(int i=0;i<sectionCount;i++){
            name += "(" + sections[i].getTeacher() + ")";
        }
        return name;
    }







}
