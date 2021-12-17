package com.company.dymrin16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Please select mode of writing: INFO or DEBUG");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        FileLogger fileLogger = new FileLogger(line);
        fileLogger.start(line);

    }
}
