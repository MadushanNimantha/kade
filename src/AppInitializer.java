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
                login();
                break;
            case 2:
                register();
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
}
