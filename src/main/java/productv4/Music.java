package productv4;

public class Music extends Product {

    private String Artist;

    public Music() {
        super();
        Artist = "";
        count++;
    }

    public void setAuthor(String Artist) {
        this.Artist = Artist;
    }

    public String getAuthor() {
        return Artist;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + Artist;
    }
}

}
