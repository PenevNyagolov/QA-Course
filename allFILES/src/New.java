public class New {
    public static void main(String[] args) {

        Kitty kitty = new Kitty();
        kitty.name = "Bob";
//        kitty.callMammy = "Myau";
        kitty.setCallMammy("Trtauj");
        kitty.getCallMammy();

        System.out.println(kitty.name);
        System.out.println(kitty.callMammy);
        System.out.println(kitty.getCallMammy());

        Kitty kitty1 = new Kitty();
        kitty1.name = "Sam";
        System.out.println(kitty1.name);

        Dog dog = new Dog();
        dog.name = "fffh";
        System.out.println(dog.name);
        dog.voice();

    }
}


public class Cat extends Animal {
    String name;
    String color;
    String catBreed;

    //    public Cat(String name, String catBreed) {
//        this.name = name;
//        this.catBreed = catBreed;
//    }
//    public Cat(String catBreed, String name, String color) {
//        this.name = name;
//        this.catBreed = catBreed;
//    }
    public Cat(){
    }

    @Override
    public void voice(){
        System.out.println("Myaaaaaau!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}




public class Kitty extends Cat{
    String callMammy = "Mmmmaaaaayyy";

    public String getCallMammy() {
        return callMammy;
    }

    public void setCallMammy(String callMammy) {
        this.callMammy = callMammy;
    }

}


public class Animal {
    public void voice() {
        System.out.println("Voice!");
    }

}



public class Dog extends Animal{
    String name;

    @Override
    public void voice(){
        System.out.println("Guv!");
    }
}


/*
Человек: Имя Возраст
Работник: <<Имя Возраст>> Должность Зарплата
Менеджер: <<Имя Возраст>> Должность @Зарплата

*/


