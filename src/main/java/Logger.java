public class Logger {
    private static Logger instance;
    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String className, String message) {
        System.out.println("Class: " + className + ", Message: " + message);
    }
}


