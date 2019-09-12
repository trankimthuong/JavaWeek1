package testexe1;

public class ListProduct {

    public static class Product{
        private int id;
        private String name;
        private float price;
        private String description;

        public Product(){

        }

        public Product(int id, String name, float price, String description){
            this.id = id;
            this.name = name;
            this.price = price;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Product[] elements = new Product[DEFAULT_CAPACITY];

    public ListProduct(){

    }

    public void display(){

        for(int i = 0; i < size; i++){
            String result = "";
            System.out.println("Product at position " + (i + 1) + " is: ");
            result += "id: " + elements[i].id + " name: " + elements[i].name
                    + " price: " + elements[i].price + " description: " + elements[i].description;
            System.out.println(result);
        }
    }

    public void add(int index, Product product){
        ensureCapacity();
        for(int i = size - 1; i >= index; i--){
            elements[i + 1] = elements[i];
        }
        elements[index] = product;
        this.size++;
    }

    public void add(Product product){  //addLast
        elements[this.size] = product;
        this.size++;
    }


    public void fixProduct(int index, Product product){
        checkIndex(index);
        elements[index] = product;
    }

    private void ensureCapacity(){
        if(size >= elements.length){
            Product[] newElements = new Product[size * 2 + 1];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index " + index + "out of bounds");
        }
    }

    public Product remove(int index){
        checkIndex(index);
        Product product = elements[index];

        for(int i = index; i < size - 1; i++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return product;
    }

    public void findElement(String name){
        boolean check = false;
        for(int i = 0; i < size - 1; i ++){
            if(elements[i].getName() == name){
                System.out.println("you found success, product has name: " + name +" founded at position" + i);
                System.out.println("id: " + elements[i].getId());
                System.out.println("name: " + elements[i].getName());
                System.out.println("price: " + elements[i].getPrice());
                System.out.println("description: " + elements[i].getDescription());
                check = true;
            }
        }

        if(!check){
            System.out.println("cannot find product has name: " + name);
        }
    }
}
