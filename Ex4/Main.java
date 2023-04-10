package Ex4;

public class Main {
    public static void main(String[] args) {
        System.out.println("************************DEVICE**********************************");
        Device device1 = new Device("ibm", 500, "ABC100");
        Device device2 = new Device("ibm", 500, "ABC100");
        Device device3 = device2;
        System.out.println(device1.equals(device2));
        System.out.println(device1.equals(device3));
        System.out.println(device3.equals(device2));

        System.out.println("Device1 hashcode: " + device1.hashCode());
        System.out.println("Device2 hashcode: " + device2.hashCode());
        System.out.println("Device3 hashcode: " + device3.hashCode());

        device2 = new Device("ibm", 500, "ABC101");
        System.out.println(device1.equals(device2));
        System.out.println(device3.equals(device2));
        System.out.println("Device2 hashcode: " + device2.hashCode());

        System.out.println("************************MONITOR*********************************");
        Monitor monitor1 = new Monitor("ibm", 500, "ABC100", 100, 200, 1, "1-20-50");
        Monitor monitor2 = new Monitor("ibm", 500, "ABC100", 100, 200, 1, "1-20-50");
        System.out.println(monitor1.equals(monitor2));

        System.out.println("Monitor1 hashcode: " + monitor1.hashCode());
        System.out.println("Monitor2 hashcode: " + monitor2.hashCode());

        monitor2 = new Monitor("ibm", 500, "ABC100", 100, 200, 1, "1-21-51");
        System.out.println(monitor1.equals(monitor2));
        System.out.println("Monitor2 hashcode: " + monitor2.hashCode());
    }
}
