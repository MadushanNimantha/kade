import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppInitializer {
    //Database area
    static String[][] users = new String[3][2];

    //Database area
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean exitState = false;
        //        Programme initialization
        String[] initializePageQuestions = {
                "1) Do you want to login?",
                "2) Are you new to here?",
                "3) Do you want to exit the page?"
        };

        while (!exitState) {
            for (String question : initializePageQuestions) {
                System.out.println(question);
            }
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    users[0][0] = "madu";
                    users[0][1] = "123";
                    if (login()) {
                        printUi("Dashboard");
                        openDashBoard();
                    }
                    printUi("Application");
                    break;
                case 2:
                    if (register()) {
                        printUi("Dashboard");
                        openDashBoard();
                    }
                    printUi("Dashboard");
                    break;
                case 3:
                    System.out.println("Good Bye");
                    return;
                default:
                    System.out.println("Wrong \uD83D\uDE1E");
                    return;
            }
        }


//        Programme initialization
    }


    //    Login Process
    public static boolean login() {
        printUi("Login");
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Your Email");
        String email = input.nextLine();
        System.out.println("Insert your Password");
        String password = input.nextLine();

        for (int i = 0; i < users.length; i++) {
            if (users[i][0] != null && users[i][0].equals(email)) {
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
        String dashBoardQuestions[] = {
                "1) Customer Management",
                "2)Item Management",
                "3)Order Management",
                "4)Logout"
        };
        while (true) {
            for (String questions : dashBoardQuestions
            ) {
                System.out.println(questions);
                return;
            }

        }
    }
    //    Dashboard process

    public static void printUi(String position) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm-ss");

        String simpleDate = dateFormat.format(date);
        String simpleTime = timeFormat.format(date);
        System.out.println("========" + simpleDate + "========" + simpleTime + "==>" + position);
//        System.out.println("===========================@System===============================");

    }


}
