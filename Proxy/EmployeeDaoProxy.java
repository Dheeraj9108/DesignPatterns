public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDaoImplObj;
    EmployeeDaoProxy(){
        employeeDaoImplObj = new EmployeeDaoImpl();
    }

    
    public void create(String client) {
        if(client.equals("ADMIN")){
            employeeDaoImplObj.create(client);
        }else{
            System.out.println("Access Denied");
        }
    }

 
    public void delete(String client, int id) {
        if(client.equals("ADMIN")){
            employeeDaoImplObj.delete(client,id);
        }else{
            System.out.println("Access Denied");
        }
    }

   
    public void get(String client, int id) {
        if(client.equals("ADMIN")){
            employeeDaoImplObj.delete(client,id);
        }else{
            System.out.println("Access Denied");
        }
    }
    
}
