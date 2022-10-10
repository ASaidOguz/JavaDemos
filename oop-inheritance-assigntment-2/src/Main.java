public class Main {
    public static void main(String[] args) {
       Customer customer=new Customer();
       Employee employee=new Employee();
       EmployeeManager employeeManager=new EmployeeManager();

       employeeManager.List();
       employeeManager.Add();
       employeeManager.BestEmployee();


       employee.email="asdad@gmail.com";


        System.out.println(employee.email);
    }
}