// 📘 Example 2: Enum Implementing Interface & Using Switch

interface StatusMessage {
    void displayMessage();
}

enum Status implements StatusMessage {
    SUCCESS {
        public void displayMessage() {
            System.out.println("✅ Operation completed successfully!");
        }
    },
    FAILED {
        public void displayMessage() {
            System.out.println("❌ Operation failed. Please retry.");
        }
    },
    PENDING {
        public void displayMessage() {
            System.out.println("⏳ Operation is still pending...");
        }
    };
}

public class EnumInterfaceExample {
    public static void main(String[] args) {
        System.out.println("🧩 Enum Example 2: Status Interface and Switch\n");

        Status current = Status.PENDING;

        // Using enum in switch-case
        switch (current) {
            case SUCCESS -> System.out.println("🎉 Great! You’re done.");
            case FAILED -> System.out.println("⚠️ Try again!");
            case PENDING -> System.out.println("⌛ Please wait...");
        }

        // Calling enum-specific method
        System.out.println();
        current.displayMessage();

        // Listing all constants
        System.out.println("\nAll Status values:");
        for (Status s : Status.values()) {
            System.out.println(s.name());
        }
    }
}

 