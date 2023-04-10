package Ex4;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private int ethernetAdapter;
    private String mac;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY, int ethernetAdapter, String mac) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.ethernetAdapter = ethernetAdapter;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", X = " + resolutionX +
                ", Y = " + resolutionY;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Monitor monitor)) return false;
        if (!super.equals(object)) return false;
        return resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY &&
                ethernetAdapter == monitor.ethernetAdapter &&
                Objects.equals(mac, monitor.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY, ethernetAdapter, mac);
    }
}
