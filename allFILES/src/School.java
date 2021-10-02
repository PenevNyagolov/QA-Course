public class School {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Maria Ivanovna", "Petrova", 35);
        Teacher teacher3 = new Teacher("Ivan Petrovich", "Ivanov",55,"Math", true);
        Teacher teacher4 = new Teacher(true);


        //System.out.println(teacher2.getFirstName());
        teacher1.setIsTeacher(false);

        teacher3.printCard(teacher3.getFirstName(), teacher3.getLastName(), teacher3.getAge(),
                teacher3.getSubject(), teacher3.getIsTeacher());

        teacher2.setIsTeacher(true);
        teacher2.setSubject("Russian Literature");

        teacher2.printCard(teacher2.getFirstName(), teacher2.getLastName(), teacher2.getAge(),
                teacher2.getSubject(), teacher2.getIsTeacher());


        Student student1 = new Student("Masha", "Semyonova", 10, "5 grade", true);
        Student student2 = new Student("Vova", "Sidorov", 7, "1 grade");
        Student student3 = new Student(true);

//        student1.printCard(student1.getFirstName(), student1.getLastName(), student1.getAge(), student1.getGrade(), student1.isStudent());
//        student2.printCard(student2.getFirstName(), student2.getLastName(), student2.getAge(), student2.getGrade(), student2.isStudent());
//        student3.printCard(student3.getFirstName(), student3.getLastName(), student3.getAge(), student3.getGrade(), student3.isStudent());

        Teacher teacher11 = new Teacher("Elena Sergeevna", "Tarasova", 25, "English", true);

        teacher11.printCard(teacher11.getFirstName(), teacher11.getLastName(), teacher11.getAge(),
                teacher11.getSubject(), teacher11.getIsTeacher());


//        teacher11.setAge(25);
//
//        teacher11.printCard(teacher11.getFirstName(), teacher11.getLastName(), teacher11.getAge(),
//                teacher11.getSubject(), teacher11.getIsTeacher());



    }
}
