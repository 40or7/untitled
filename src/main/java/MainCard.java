public class MainCard {
    public static void main(String[] args) {
        String information = "This is the information from the memory card";
        MemoryCardReader memoryCardReader = new MemoryCardReader(information);
        UsbAdapter usbAdapter = new UsbAdapter(memoryCardReader);
        Computer computer = new Computer();
        computer.readInformation(usbAdapter);
    }
}