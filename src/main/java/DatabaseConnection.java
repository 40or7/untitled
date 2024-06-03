public class DatabaseConnection {
    private String databaseName;
    private String proxyUrl;

    public DatabaseConnection(String databaseName, String proxyUrl) {
        this.databaseName = databaseName;
        this.proxyUrl = proxyUrl;
    }

    public void connect() {
        String fullUrl = proxyUrl + "/" + databaseName;
        System.out.println("Connected to database: " + fullUrl);
    }
}

