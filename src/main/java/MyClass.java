public class MyClass {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log(MyClass.class.getName(), "This is a test message");
    }
}
