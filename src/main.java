import java.util.Scanner;
public class main {
    // write your code here
    static String[] name = new String[10];
    static Scanner scanner = new Scanner(System.in);
    static int option;

    public static void main(String[] arg) {
        do {
            display_menu();
            insertTestName();
            display_guests();
            int option = getOption();
            if (option == 1) {
                addGuests();
            } else if (option == 2) {
                removeGuest();
            } else if (option == 3) {
                renameGuest();
            } else if (option == 4) {
                particularRoom();
            } else if (option == 5) {
                System.out.println("Exiting......");
                break;
            }
        } while (true);

    }

    static void display_menu() {
        System.out.println("_______________________");
        System.out.println("-Menu-");
        System.out.println("1   - Add guest");
        System.out.println("2   - Remove guest");
        System.out.println("3   - Rename Guest");
        System.out.println("4   - Room Number");
        System.out.println("5   - Exit");
        System.out.println("_______________________");
    }

    static void insertTestName() {
        name[0] = "abhishek";
        name[1] = "verma";
        name[2] = "abi";
    }

    static void display_guests() {
        System.out.println("-Guests-");
        boolean isEmpty = true;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                System.out.println((i + 1) + " " + name[i]);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Guests list is empty.");
        }
        System.out.println("_______________________");
    }

    static int getOption() {
        System.out.print("Enter option  :");
        option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuests() {
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null) {
                System.out.print("Name  : ");
                String user_name = scanner.nextLine();
                name[i] = user_name;
                break;
            }
        }
    }

    static void removeGuest() {
        System.out.print("Number    : ");
        int num = scanner.nextInt();
        if (num > 0 && num < name.length && name[num - 1] != null) {
            name[num - 1] = null;
        }
        String[] temp_name = new String[name.length];
        int ti = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                temp_name[ti] = name[i];
                ti++;
            }
        }
        name = temp_name;
    }

    static void renameGuest() {
        System.out.print("Number  : ");
        int num = scanner.nextInt();
        System.out.print("Name    : ");
        String rename = scanner.next();
        name[num - 1] = rename;

    }

    static void particularRoom() {
        System.out.print("Room Number   :");
        int num = scanner.nextInt();
        if (num > 0 && num < name.length && name[num - 1] == null) {
            System.out.print("Name  :");
            String user_input = scanner.next();
            name[num - 1] = user_input;
        }
    }
}
