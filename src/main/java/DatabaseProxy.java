public class DatabaseProxy {
    private String proxyUrl;

    public DatabaseProxy(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    public DatabaseConnection getConnection(String databaseName) {
        return new DatabaseConnection(databaseName, proxyUrl);
    }
}
