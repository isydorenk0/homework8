package Ex3;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString() {
        return "Device: " +
                "manufacturer = " + manufacturer +
                ", price = " + price +
                ", serialNumber = " + serialNumber;
    }
}
