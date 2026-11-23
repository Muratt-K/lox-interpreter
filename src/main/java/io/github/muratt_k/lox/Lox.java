package io.github.muratt_k.lox;

public class Lox {
    public static void main(String[] args) {

        if (args.length > 1) {
            System.err.println("Usage warning");
            System.exit(64);
        }

        else if (args.length == 1) {
            runFile(args[0]);
        }

        else {
            runPrompt();
        }
    }

    private static void runFile(String path) {
        //todo in session2
    }

    private static void runPrompt() {
        //todo in session2
    }
}
