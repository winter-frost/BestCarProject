package car.src;

public final class GenerateCommands {
    private static final char FORWARDS = 'g';
    private static final char BACKWARDS = 'b';
    private static final char LEFT = 'l';
    private static final char RIGHT = 'r';
    private static final char ABORT = 'a';

    public static String goForwards(String previousCommandString) {
        return previousCommandString + FORWARDS;
    }

    public static String goBackwards(String previousCommandString) {
        return previousCommandString + BACKWARDS;
    }

    public static String goLeft(String previousCommandString) {
        return previousCommandString + LEFT;
    }

    public static String goRight(String previousCommandString) {
        return previousCommandString + RIGHT;
    }

    public static String abort() {
        return String.valueOf(ABORT);
    }

    private GenerateCommands() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    }
}