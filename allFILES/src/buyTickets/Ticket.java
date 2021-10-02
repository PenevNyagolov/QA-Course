package buyTickets;

public class Ticket extends Person{
    double price;

    public double getPrice(){
        if (age <=1) {
            price = 0;
        } else if (age < 18){
            price = price * 0.8;
        } else if (age >= 55 && age <= 120){
            price = price * 0.5;
        } else if (age > 120){
            System.out.println("Enter valid age");
            price = 0;
        }
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

