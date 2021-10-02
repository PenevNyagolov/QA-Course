package property;

public class New {
      /*
   Создать класс недвижимость и включить в него следующие параметры
Сколько этажей
Сколько помещений на этаже
Создать два класса недвижимости, которые наследуется от основного класса недвижимость:  жилое и офисы
Если недвижимость жилая то включить параметры: многоквартирные дом или частный дом
Создать класс собственник(арендатор) и переопределять его в каждом классе по параметру «фамилия»
    */

    public static void main(String[] args) {
        Commertial commertial = new Commertial();
        commertial.buildingType();
        commertial.setNumberOfStoreys(98);
        commertial.setRoomsOfTheFloor(23);
        Owner owner = new Owner();
        owner.setLastName("Sam");

        System.out.println("Owner name " + owner.getLastName());
        System.out.println("Колличество этажей " + commertial.getNumberOfStoreys());
        System.out.println("Колличество помещений " + commertial.getRoomsOfTheFloor());

        System.out.println("__________----______");

        Residential residential = new Residential();
        residential.buildingType();
        residential.setNumberOfStoreys(2);
        residential.setRoomsOfTheFloor(2);
        Owner owner1 = new Owner();
        owner1.setLastName("Kate");

        System.out.println("Owner name " + owner1.getLastName());
        System.out.println("Колличество этажей " + residential.getNumberOfStoreys());
        System.out.println("Колличество помещений " + residential.getRoomsOfTheFloor());
    }

}
