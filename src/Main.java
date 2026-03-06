import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Add Book");
            System.out.println("2 View Books");
            System.out.println("3 Issue Book");
            System.out.println("4 Return Book");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Book ID");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Title");
                    String title = sc.nextLine();

                    System.out.println("Enter Author");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.println("Enter Book ID to issue");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;

                case 4:
                    System.out.println("Enter Book ID to return");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");

            }

        }

    }

}