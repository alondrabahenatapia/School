public class Teacher extends Person{
    // Properties
    private int sectionCount;
    private String subject;
    private Section[] sections = new Section[10];
    //private String name;

    //Constructor
    public Teacher(String name,String subject){
        super(name);
        this.subject = subject;

    }



    public String getSubject() {

        return subject;
    }
    public void setSubject(String subject){

        this.subject = subject;
    }
    public Section[] getSections() {

        return sections;
    }
    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }
    public String toString(){
        return getName() + " teaches the following sections: " + sectionInfo() ;
    }

    public String sectionInfo(){
        String section = "";
        for(int i = 0; i < sectionCount; i++) {
            section += sections[i].getName() + "(" + sectionCount + ")" ;
        }
        return section;
    }
}
