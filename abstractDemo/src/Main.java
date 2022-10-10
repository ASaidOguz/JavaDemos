public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java!");
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new MySqlDatabaseManager();
        customerManager.getCustomers();
    }


}