// package java-by-zahed.14.Enums;
// 📘 Example 1: Enum with Constructors & Methods

enum Level {
    LOW(1), MEDIUM(2), HIGH(3);

    private int rank;

    // Constructor
    Level(int rank) {
        this.rank = rank;
    }

    // Getter method
    public int getRank() {
        return rank;
    }

    // Custom method
    public void showDetails() {
        System.out.println(this.name() + " level has rank: " + rank);
    }
}

public class EnumExample {
    public static void main(String[] args) {
        System.out.println("🧩 Enum Example 1: Levels and Ranks\n");

        for (Level l : Level.values()) {
            l.showDetails();
        }

        Level current = Level.HIGH;
        System.out.println("\nCurrent level: " + current);
        System.out.println("Rank value: " + current.getRank());
    }
}


