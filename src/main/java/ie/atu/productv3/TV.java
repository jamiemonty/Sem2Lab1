package ie.atu.productv3;

public class TV extends Product {

    private int size;
    private String make;

    public TV() {
        super();
        size = 0;
        make = "";
        count++;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setMake(String make) {this.make = make;
    }

    public String getMake() {
        return make;
    }
    @Override
    public String toString() {
        return super.toString() + " by " + make + "\nScreen size is " + size + "inches";
    }

}