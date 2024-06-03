class MemoryCardReader implements Reader {
    private String information;

    public MemoryCardReader(String information) {
        this.information = information;
    }

    @Override
    public String read() {
        return information;
    }
}