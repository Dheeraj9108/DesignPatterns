public class ProxyDesignPattern {
    public static void main(String[] args) {
        EmployeeDao obj = new EmployeeDaoProxy();
        obj.create("ADMIN");
    }
}