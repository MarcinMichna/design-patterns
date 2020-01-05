package composite;

public class RegularWorker implements Employee
{
    private String name;
    private int id;

    @Override
    public void employeeDetails()
    {
        System.out.println(toString());
    }

    @Override
    public String toString()
    {
        return "RegularWorker{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public RegularWorker(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
