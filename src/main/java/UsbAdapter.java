class UsbAdapter implements Reader {
    private Reader reader;

    public UsbAdapter(Reader reader) {
        this.reader = reader;
    }

    @Override
    public String read() {
        return reader.read();
    }
}