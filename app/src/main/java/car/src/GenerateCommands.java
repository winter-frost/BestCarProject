package car.src;

public final class GenerateCommands {
    public static final char FORWARDS = 'g';
    public static final char BACKWARDS = 'b';
    public static final char LEFT = 'l';
    public static final char RIGHT = 'r';
    private static final char ABORT = 'a';

    public static String goForwards(String previousCommandString, int number) {
        String newCommand = "";
        for (int i = 0; i < number; i++)
        {
            newCommand += FORWARDS;
        }
        return previousCommandString + newCommand;
    }

    public static String goBackwards(String previousCommandString, int number) {
        String newCommand = "";
        for (int i = 0; i < number; i++)
        {
            newCommand += BACKWARDS;
        }
        return previousCommandString + newCommand;
    }

    public static String goLeft(String previousCommandString, int number) {
        String newCommand = "";
        for (int i = 0; i < number; i++)
        {
            newCommand += LEFT;
        }
        return previousCommandString + newCommand;
    }

    public static String goRight(String previousCommandString, int number) {
        String newCommand = "";
        for (int i = 0; i < number; i++)
        {
            newCommand += RIGHT;
        }
        return previousCommandString + newCommand;
    }

    public static String abort() {
        return String.valueOf(ABORT);
    }

    private GenerateCommands() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    }
}