public class Runner {



    public static void main(String[] args) {


        School berkeley = new School("Berkeley High School");


        Section math = new Section("math");
        Section economy = new Section("Economy");
        Section computerScience = new Section("Computer Science");

        Teacher goodrich = new Teacher("Mr.GoodRich", "Math");
        Teacher mckee = new Teacher("Ms.Mckee", "Economy");
        Teacher albinson = new Teacher("Mr.Albinson", "Computer Science");

        Student Alondra = new Student("Alondra ", 11);
        Student Maribel = new Student("Maribel ", 11);
        Student Samantha = new Student("Samantha ", 11);
        Student Aiden = new Student("Aiden ", 11);
        Student Lydia = new Student("Lydia ", 11);
        Student Alexia = new Student("Alexia ", 11);
        //School and section
        berkeley.addSections(math);
        berkeley.addSections(economy);
        berkeley.addSections(computerScience);
        //section and teacher
        math.setTeacher(goodrich);
        economy.setTeacher(mckee);
        computerScience.setTeacher(albinson);
        //section and students
        //math
        math.addStudent(Alondra);
        math.addStudent(Maribel);
        math.addStudent(Samantha);
        math.addStudent(Aiden);
        math.addStudent(Lydia);
        math.addStudent(Alexia);
        //economy
        economy.addStudent(Alondra);
        economy.addStudent(Maribel);
        economy.addStudent(Samantha);
        economy.addStudent(Aiden);
        economy.addStudent(Lydia);
        economy.addStudent(Alexia);
        //computerScience
        computerScience.addStudent(Alondra);
        computerScience.addStudent(Maribel);
        computerScience.addStudent(Samantha);
        computerScience.addStudent(Aiden);
        computerScience.addStudent(Lydia);
        computerScience.addStudent(Alexia);
        //section into teachers
        goodrich.addSection(math);

        mckee.addSection(economy);
        albinson.addSection(computerScience);
        //students into section
        Alondra.addSection(math);
        Alondra.addSection(economy);
        Alondra.addSection(computerScience);

        Maribel.addSection(math);
        Maribel.addSection(economy);
        Maribel.addSection(computerScience);

        Samantha.addSection(math);
        Samantha.addSection(economy);
        Samantha.addSection(computerScience);

        Aiden.addSection(math);
        Aiden.addSection(economy);
        Aiden.addSection(computerScience);

        Lydia.addSection(math);
        Lydia.addSection(economy);
        Lydia.addSection(computerScience);

        Alexia.addSection(math);
        Alexia.addSection(economy);
        Alexia.addSection(computerScience);

        //toString

        System.out.println(berkeley.toString());
        System.out.println(math.toString());
        System.out.println(economy.toString());
        System.out.println(computerScience.toString());
        System.out.println(goodrich.toString());
        System.out.println(mckee.toString());
        System.out.println(albinson.toString());
        System.out.println(Alondra.toString());
        System.out.println(Maribel.toString());
        System.out.println(Samantha.toString());
        System.out.println(Aiden.toString());
        System.out.println(Lydia.toString());
        System.out.println(Alexia.toString());










    }
















}
