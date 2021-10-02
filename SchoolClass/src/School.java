public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Maria Ivanovna", "Petrova", 35);
        Teacher teacher3 = new Teacher("Ivan Petrovich", "Ivanov", 55, "Math",
                true);
        Teacher teacher4 = new Teacher(true);
//System.out.println(teacher2.getFirstName());
        teacher1.setIsTeacher(false);
        teacher3.printCard(teacher3.getFirstName(), teacher3.getLastName(),
                teacher3.getAge(),
                teacher3.getSubject(), teacher3.getIsTeacher());
        teacher2.setIsTeacher(true);
        teacher2.setSubject("Russian Literature");
        teacher2.printCard(teacher2.getFirstName(), teacher2.getLastName(),
                teacher2.getAge(),
                teacher2.getSubject(), teacher2.getIsTeacher());
    }
}
