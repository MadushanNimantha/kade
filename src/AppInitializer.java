import java.util.Scanner;

public class AppInitializer {
    //Database area
    static String[][] users = new String[3][2];

    //Database area
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //        Programme initialization
        String[] initializePageQuestions = {
                "1) Do you want to login?",
                "2) Are you new to here?",
                "3) Do you want to exit the page?"};
        for (String question : initializePageQuestions) {
            System.out.println(question);
        }
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                if (login()) {
                    openDashBoard();
                }
                break;
            case 2:
                if (register()) {
                    openDashBoard();
                }
                break;
            case 3:
                break;
            default:
                return;
        }

//        Programme initialization
    }


    //    Login Process
    public static boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Your Email");
        String email = input.nextLine();
        System.out.println("Insert your Password");
        String password = input.nextLine();

        for (int i = 0; i < users.length; i++) {
            if (users[i][0].equals(email)) {
                if (users[i][1].equals(password)) {
                    System.out.println("Welcome");
                    return true;
                } else {
                    System.out.println("Wrong Password ");
                    return false;
                }
            }
        }
        System.out.println("404 Not found");
        return false;
    }

    //    Login Process

    //    Register Process
    public static boolean register() {
        Scanner input = new Scanner(System.in);
        if (users[users.length - 1][0] != null) {
            System.out.println("User database is full");
            return false;
        }
        System.out.println("Insert Your Email");
        String email = input.nextLine();
        System.out.println("Insert your Password");
        String password = input.nextLine();

        for (int x = 0; x < users.length; x++) {
            if (users[x][0] == null) {
                users[x][0] = email;
                users[x][1] = password;
                return true;
            } else {
                if (users[x][0].equalsIgnoreCase(email)) {
                    System.out.println("Email is already exists");
                    return false;
                }
            }
        }
        return false;
    }

    //    Register Process

    //    Dashboard process

    public static void openDashBoard() {
        System.out.println("This is DashBoard");
    }
    //    Dashboard process
}
