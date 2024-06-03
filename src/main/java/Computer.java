class Computer {
    public void readInformation(Reader reader) {
        String information = reader.read();
        System.out.println("Read information: " + information);
    }
}