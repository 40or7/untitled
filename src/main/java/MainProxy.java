public class MainProxy {
    public static void main(String[] args) {
        String proxyUrl = "localhost:8080";
        DatabaseProxy proxy = new DatabaseProxy(proxyUrl);

        String databaseName = "myDatabase";
        DatabaseConnection connection = proxy.getConnection(databaseName);
        connection.connect();
    }
}