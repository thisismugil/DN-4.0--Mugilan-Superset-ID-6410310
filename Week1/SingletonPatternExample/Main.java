public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Message 1");
        Logger logger2 = Logger.getInstance();
        logger2.log("Message 2");
        if (logger1 == logger2) {
            System.out.println("Only 1 Logger instance - singleton pattern");
        } else {
            System.out.println("Multiple Logger instances - not a singleton pattern");
        }
    }
}

