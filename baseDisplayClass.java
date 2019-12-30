import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

class AdminDisplay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("/Users/vishalgupta/Desktop/Info.txt"));
        input.useDelimiter("-|\n");

        Product[] products = new Product[0];
        while (input.hasNext()) {
            
            String username = input.next();
            String company = input.next();
            String regNo = input.next().substring(0);
            String insurance = input.next();
            String fines = input.nextLine().substring(1);

            Product newProduct = new Product(company, regNo, username, fines, insurance);
            products = addProduct(products, newProduct);
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static Product[] addProduct(Product[] products, Product productToAdd) {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[newProducts.length - 1] = productToAdd;

        return newProducts;
    }

    public static class Product {
        protected String company;
        protected String regNo;
        protected String username;
        protected String fines;
        protected String insurance;

        public Product(String n, String p, String d, String f, String s) {
            company = n;
            regNo = p;
            username = d;
            fines = f;
            insurance = s;
        }

        @Override
        public String toString() {
            return String.format("Owner name: %s\r\nCar model: %s\r\nRegistration number: %s\r\nInsurance status: %s\r\nFines: %s\n",
                    username, company, regNo, insurance,fines);
        }
    }
}