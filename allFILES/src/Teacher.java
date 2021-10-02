public class Teacher {

    private String firstName;
    private String lastName;
    private int age;
    private String subject;
    private boolean isTeacher;

    Teacher(){
    }

    Teacher(boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

    Teacher(String firstName, String lastName, int age, String subject, boolean isTeacher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setAgeIsTeacher(age);
        this.setSubject(subject);
    }

    Teacher(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAgeIsTeacher(int age) {
        if ( age >= 21 && age < 65) {
            this.age = age;
            this.isTeacher = true;
        } else {
            System.out.println("Not eligible age.");
            this.isTeacher = false;
            this.subject = null;
        }
    }

    public void setSubject(String subject) {
        if (getIsTeacher() == false) {
            this.subject = null;
        } else if (getIsTeacher()) {
            this.subject = subject;
        } else {
            this.subject = subject;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setIsTeacher(boolean isTeacher) {
        if (getIsTeacher() == false) {
            this.isTeacher = false;
        } else if (getIsTeacher()) {
            this.isTeacher = true;
        } else {
            this.isTeacher = isTeacher;
        }
        //this.isTeacher = isTeacher;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public boolean getIsTeacher() {
        return isTeacher;
    }

    public void printCard(String firstName, String lastName, int age, String subject,
                          boolean isTeacher) {
        System.out.println("_______________________________________________________");
        if (isTeacher) {
            System.out.println("Teacher");
        }
        System.out.println(firstName + " " + lastName + ", " + age);
        System.out.println(subject);
        System.out.println("_______________________________________________________");
    }

}

//    String firstName1 = "Мария Ивановна";
//    String lastName1 = "Петрова";
//    int age1 = 35;
//    String subject1 = "Russian Literature";
//    boolean isTeacher1 = true;
//
//
//    String firstName2 = "Иван Петрович";
//    String lastName2 = "Иванов";
//    int age2 = 55;
//    String subject2 = "Math";
//    boolean isTeacher2 = true;

