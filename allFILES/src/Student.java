public class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String grade;
        private boolean isStudent;

        Student() {
        }

        Student(boolean isStudent) {
            this.isStudent = isStudent;
        }

        Student(String firstName, String lastName, int age, String grade, boolean isStudent) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.grade = grade;
            this.isStudent = isStudent;
        }

        Student(String firstName, String lastName, int age, String grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public boolean isStudent() {
            return isStudent;
        }

        public void setStudent(boolean student) {
            isStudent = student;
        }

        public void printCard(String firstName, String lastName, int age, String grade, boolean isStudent) {
            if (isStudent) {
                System.out.println("Student");
            }
            System.out.println(firstName + " " + lastName + ", " + age);
            System.out.println(grade);
            System.out.println("__________________________________________");
        }
    }

//    String firstName1 = "Маша";
//    String lastName1 = "Семенова";
//    int age1 = 10;
//    String grade1 = "5 класс";
//    boolean isStudent1 = true;
//
//    String firstName2 = "Вова";
//    String lastName2 = "Сидоров";
//    int age2 = 7;
//    String grade2 = "1 класс";
//    boolean isStudent2 = true;

