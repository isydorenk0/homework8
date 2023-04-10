package Ex2;

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
}
