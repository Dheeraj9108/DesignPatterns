public class EmployeeDaoImpl implements EmployeeDao {

    public void create(String client) {
        System.out.println("Client Created Successfully");
    }

    public void delete(String client, int id) {
        System.out.println("Client Deleted Successfully");
    }

   
    public void get(String client, int id) {
        System.out.println("Client Data");
    }
    
}
