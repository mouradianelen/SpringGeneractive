package am.aca.generactive.generactive.util.generators;

public class GroupIdGenerator {
    private static int CURRENT = 1;

    public static int getNextId() {
        return CURRENT++;
    }

    private GroupIdGenerator() {

    }
}
