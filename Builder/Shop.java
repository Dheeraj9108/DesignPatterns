public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setProcessor("Snapdragon").getPhone();
        System.out.println(p);
    }
}