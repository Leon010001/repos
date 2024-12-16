//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Smartphone smart = new Smartphone("Iphone 10", 2020, 30000);
        String smartModel=smart.getModel();
        int smartYearOfProd=smart.getYearOfProduction();
        int smartCost=smart.getCost();

        System.out.println("Наименование модeли: "+smartModel);
        System.out.println("Год выпуска: "+smartYearOfProd);
        System.out.println("Стоимость: "+smartCost);


        smart.setModel("Samsung s23");
        smart.setYearOfProduction(2023);
        smart.setCost(100000);

        System.out.println("\nНаименование модeли: "+smart.getModel());
        System.out.println("Год выпуска: "+smart.getYearOfProduction());
        System.out.println("Стоимость: "+smart.getCost());
    }
}