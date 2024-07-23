//package Chapper4;
//
//public class Product {
//    private String name;
//    private double price;
//    private double tax;
//
//    // Hàm khởi tạo không có tham số
//    public Product(){
//    }
//
//    // Hàm khởi tạo có tham số
//    public Product(String name,double price,double tax){
//        this.name = name;
//        this.price = price;
//        this.tax = tax;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public double getTax() {
//        return tax;
//    }
//
//    public void setTax(double tax) {
//        this.tax = tax;
//    }
//
//    public Product Nhapthongtin(String name, double price, double tax){
//        Product pr = new Product(name,price,tax);
//        return pr;
//    }
//    public void Xuatthongtin(Product pr){
//        System.out.println(" name = " +pr.getName() + " price = " + pr.getPrice() + " Tax = " + pr.getTax());
//    }
//    public double Gettaxprice(double price,double tax){
//        return price * tax;
//    }
//}
