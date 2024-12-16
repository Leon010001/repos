public class Smartphone {
    private String model;
    private int yearOfProduction;
    private int cost;

    public Smartphone(String model, int yearOfProduction, int cost){
        this.model=model;
        this.yearOfProduction=yearOfProduction;
        this.cost=cost;
    }

    public Smartphone(){

    }

    public void incomingCall(){
        System.out.println("*входящий вызов*");
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public int getYearOfProduction(){
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction){
       if (yearOfProduction >= 2015 && yearOfProduction <= 2024){
           this.yearOfProduction=yearOfProduction;
       } else {
           System.out.println("Ошибка! Укажите смартфон произведенный в промежутке 2015-2024 годов");
       }
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        if(cost >= 5000) {
            this.cost = cost;
        } else {
            System.out.println("Ошибка! Укажите смартфон стоимостью не ниже 5000!");
        }
    }

}
