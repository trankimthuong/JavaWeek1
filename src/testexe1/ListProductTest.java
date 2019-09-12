package testexe1;

public class ListProductTest {
    public static void main(String[] args) {
        ListProduct listProduct = new ListProduct();
        ListProduct.Product product1 = new ListProduct.Product(1, "sony", 12, "hang deu lam");
        ListProduct.Product product2 = new ListProduct.Product(2, "samsung", 18, "hang dung duoc");
        ListProduct.Product product3 = new ListProduct.Product(3, "ip11", 100, "dat vch");
        ListProduct.Product product4 = new ListProduct.Product();
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(1, product4);
        listProduct.display();

        //listProduct.fixProduct(1, product2);
        //listProduct.display();

        //listProduct.remove(1);
        //listProduct.display();

        listProduct.findElement("sony");

    }
}
