package app;

public class Main {
    public static void main(String[] args) {
        getOutput(Corrector().handleData(
                new DataProvider())
        );
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
