package javaLabs;

class TablePrinter implements Runnable {
    private int number;
    private String tableName;

    public TablePrinter(int number, String tableName) {
        this.number = number;
        this.tableName = tableName;}
    @Override
    public void run() {
        System.out.println("\n" + tableName + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(100); // Adding slight delay for readability
            } catch (InterruptedException e) {
                e.printStackTrace();}}}}
public class Lab4ques2 {
	public static void main(String[] args) {
        int rollNumberTable = 63; // Last two digits of roll number
        int dobTable = 25;         // Day of birth

        // Creating two threads for each table
        Thread rollNumberTableThread = new Thread(new TablePrinter(rollNumberTable, "Roll Number Table"));
        Thread dobTableThread = new Thread(new TablePrinter(dobTable, "Date of Birth Table"));

        // Start both threads concurrently
        rollNumberTableThread.start();
        dobTableThread.start();
    }

}
