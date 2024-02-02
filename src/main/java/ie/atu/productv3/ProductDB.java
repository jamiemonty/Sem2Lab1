package ie.atu.productv3;

public class ProductDB {

    ie.atu.productv2.Software mySoftware = null;
    if (productCode.equalsIgnoreCase("studios")) {
        mySoftware = new ie.atu.productv2.Software();
        mySoftware.setCode(productCode);
        mySoftware.setDescription("Visual Studios");
        mySoftware.setPrice(57.50);
        mySoftware.setVersion("Microsoft 1.1");
    } else if (productCode.equalsIgnoreCase("eclipse")) {
        mySoftware = new ie.atu.productv2.Software();
        mySoftware.setCode(productCode);
        mySoftware.setDescription("Build Java apps");
        mySoftware.setPrice(57.50);
        mySoftware.setVersion("Eclipse Neon");
    } else if (productCode.equalsIgnoreCase("oracle")) {
        mySoftware = new Software();
        mySoftware.setCode(productCode);
        mySoftware.setDescription("Latest MySQL");
        mySoftware.setPrice(54.50);
        mySoftware.setVersion("Oracle 3.0");
    }




        return mySoftware;
    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
}

