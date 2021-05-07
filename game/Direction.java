package mpjp.game;

public enum Direction implements java.io.Serializable, java.lang.Comparable<Direction>{
    EAST,
    SOUTH,
    WEST,
    NORTH;
    Direction direction;
    //Signal of X axis variation in this direction, one of { -1, 0, 1 }
    public int getSignalX() {
        int result=0;
        switch(direction) {
        case NORTH: result=0;
        break;
        case EAST: result=1;
        break;
        case SOUTH: result=0;
        break;
        case WEST: result=-1;
        break;
        }
        return result;
    }
    //Signal of Y axis variation in this direction, one of { -1, 0, 1 }

    public int getSignalY() {
        int result=0;
        switch(direction) {
        case NORTH: result=-1;
        break;
        case EAST: result=0;
        break;
        case SOUTH: result=1;
        break;
        case WEST: result=0;
        break;
        }
        return result;
    }
    //Returns the enum constant of this type with the specified name.

    public static Direction valueOf​(String name) {
        switch (name) {
        case "NORTH":
            return NORTH;
        case "EAST":
            return EAST;
        case "SOUTH":
            return SOUTH;
        case "WEST":
            return WEST;
        default:
            throw new IllegalArgumentException("Wrong Input");

        }
    }
}