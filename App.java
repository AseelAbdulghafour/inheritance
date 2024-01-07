package inhertance;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nasserSkills = {"Java", "Python","SQL"};
        Employee aseel = new Employee("Aseel", "IT", 2000); 
        Manager fares = new Manager("Fares", "HR", 3000, 20);
        Director jamal = new Director("Jamal", "IT", 3500, 25000);
        SalesPerson Fajer = new SalesPerson("Fajer","Accounting", 1800, 170);
        Engineer nasser = new Engineer("Nasser", "IT", 2300, nasserSkills);

        System.out.println(aseel);
        System.out.println(fares);
        System.out.println(jamal);
        System.out.println(Fajer);
        System.out.println(nasser);

    }
}