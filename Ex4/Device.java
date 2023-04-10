package Ex4;

import java.util.Objects;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Device device)) return false;
        return Float.compare(device.price, price) == 0 &&
                Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
