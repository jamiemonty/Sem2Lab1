package ie.atu.productv3;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product product = null;
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            product = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            product = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            product = mySoftware;
        }

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            product = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            product = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            product = myBook;
        }

        if (productCode.equalsIgnoreCase("Post")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Twelve Carat Toothache");
            myMusic.setPrice(7.50);
            myMusic.setArtist("Post Malone");
            myMusic.setLabel("Republic Records");
            product = myMusic;
        } else if (productCode.equalsIgnoreCase("Kanye")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Graduation");
            myMusic.setPrice(12.00);
            myMusic.setArtist("Kanye West");
            myMusic.setLabel("Universal International");
            product = myMusic;
        } else if (productCode.equalsIgnoreCase("Calvin")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("18 Months");
            myMusic.setPrice(10.00);
            myMusic.setArtist("Calvin Harris");
            myMusic.setLabel("Columbia Records");
            product = myMusic;
        }

        if (productCode.equalsIgnoreCase("SONY")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("4K Ultra HD HDR LED TV");
            myTV.setPrice(469.00);
            myTV.setMake("Sony");
            myTV.setSize(43);
            product = myTV;
        } else if (productCode.equalsIgnoreCase("LG")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Smart 4K Ultra HD HDR LED TV");
            myTV.setPrice(349.99);
            myTV.setMake("LG TV");
            myTV.setSize(43);
            product = myTV;
        } else if (productCode.equalsIgnoreCase("SAMSUNG")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("UHD LED 4K HDR Smart TV");
            myTV.setPrice(389.99);
            myTV.setMake("Samsung");
            myTV.setSize(43);
            product = myTV;
        }
        return product;


    }
    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
}

