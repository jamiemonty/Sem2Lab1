package ie.atu.productv3;

import ie.atu.productv1.Book;
import ie.atu.productv1.BookDB;

import java.util.Scanner;

public class ProductApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Product Viewer");
        System.out.println();

        // perform 1 or more selections
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();  // read the product code

            // get the Product object "p"
            Product product = ProductDB.getProduct(productCode);
            // But this could be a Book or a Software Object? = ProductDB.getProduct(productCode);

            // display the output

            System.out.println();
            if (product != null) {
                System.out.println("Description: " + product.toString());
                System.out.println("Price:       " + product.getPriceFormatted());
            } else {
                System.out.println("No product matches this product code.");
            }

            System.out.println();
            System.out.println("Product count: " + Product.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }
    }
}
