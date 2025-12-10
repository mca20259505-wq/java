class Product{
    String Product_name;
    String product_code;
    String manufacturer_name;

    Product(String Product_name, String product_code, String manufacturer_name)
    {
        this.Product_name = Product_name;
        this.product_code = product_code;
        this.manufacturer_name = manufacturer_name;
    }

    void displayInfo()
    {
        System.out.println("Product Name :"  + Product_name);
        System.out.println("Product Code : " + product_code);
        System.out.println("Manufacturer Name :" + manufacturer_name);
        System.out.println("----------------------------------");
    }

}
public class qs_9 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop","LP123","Dell");
        Product p2 = new Product("Smartphone","SP234","Samsung");

        p1.displayInfo();
        p2.displayInfo();
    }
}
