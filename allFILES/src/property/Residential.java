package property;

public class Residential extends RealEstate{
    String homeType;

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    @Override
    public void buildingType(){
        System.out.println("Home");
    }

}
