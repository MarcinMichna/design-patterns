package composite;

public class Manager implements Employee
{
    private String name;
    private int id;

    public Manager(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public void employeeDetails()
    {
        System.out.println(toString());
    }

    @Override
    public String toString()
    {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
