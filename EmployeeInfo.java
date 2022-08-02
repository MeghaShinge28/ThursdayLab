class Employee
{
  private String name, address;
  private int year, salary;
  public Employee(String n, int y, int sal, String add)
  {
    this.name = n;
    this.year = y;
    this.salary = sal;
    this.address = add;
  }
  public String getName()
  {
    return name;
  }
  public int getYear()
  {
    return year;
  }
  public int getSalary()
  {
    return salary;
  }
  public String getAddress()
  {
    return address;
  }
}
class Employeeinfo
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee("sreeya", 1999, 400000, "Mumbai");
    Employee e2 = new Employee("rutuja", 2000, 840000, "Pune");
    Employee e3 = new Employee("Akshata", 2002, 700000, "Benglore");

    System.out.println("Name \t Year of joining \t\t Salary \t\t Address");
    System.out.println(e1.getName() + "\t\t" + e1.getYear() + "\t\t\t" + e1.getSalary() + "\t\t\t" + e1.getAddress());  
    System.out.println(e2.getName() + "\t\t" + e2.getYear() + "\t\t\t" + e2.getSalary() + "\t\t\t" + e2.getAddress());  
    System.out.println(e3.getName() + "\t\t" + e3.getYear() + "\t\t\t" + e3.getSalary() + "\t\t\t" + e3.getAddress());  
  }
}