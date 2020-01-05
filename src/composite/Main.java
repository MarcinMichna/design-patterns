package composite;

public class Main
{
    public static void main(String[] args)
    {
        Director director = new Director();
        RegularWorker regularWorker1 = new RegularWorker("Andrzej", 1);
        RegularWorker regularWorker2 = new RegularWorker("Tomek", 2);
        Manager manager1 = new Manager("Jan",3);
        Manager manager2 = new Manager("Antek",4);

        director.addEmployee(regularWorker1);
        director.addEmployee(regularWorker2);
        director.addEmployee(manager1);
        director.addEmployee(manager2);
        director.employeeDetails();
    }
}
