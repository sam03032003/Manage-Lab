package github.libraryManagementSystem;
import java.util.*;

class Books{
    static ArrayList<String> availB = new ArrayList<>();

    // Method for Available books with it's quantity in Library
    public static void availableBooks(){
        availB.add("Wings_of_Fire");
        availB.add("Mindset");
        availB.add("How_to_win_Friends");
        System.out.println("Available books as per quantity :- " +availB);
    }
    // Method to add books in library
    public static void addBook( String s){
        availB.add(s);
        System.out.println(availB);
    }
    // Method to remove books in library
    public static void removeBook(String j){
        availB.remove(j);
    }
}

class Students{
    // Method of student database
    static ArrayList <String > availS = new ArrayList<>();
    public static void studentDatabase(){
        availS.add("Sahil");
        availS.add("Sam");
        availS.add("Rohit");
    }
    // Method to add student in student database
    public static void addStudent(String s){
        availS.add(s);
        System.out.println(availS);
    }
}

public class Management {
        public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("$$$$$$$$$$$$$-->-->-->-->-->-->-->-->-->-->///////////////////^^^^^^^^ WELCOME TO LIBRARY ^^^^^^^^///////////////////-->-->-->-->-->-->-->-->-->-->$$$$$$$$$$$$$ ");
            System.out.println();

            Books.availableBooks();

            System.out.println("-->-->-->-->-->-->-->-->-->-->//-->-->-->-->-->-->-->-->-->-->//-->-->-->-->-->-->-->-->-->-->//-->-->-->-->-->-->-->-->-->-->//-->-->-->-->-->-->-->-->-->-->//");
            System.out.println();

            System.out.println();
            System.out.println(" //////////// ........Hello........ //////////// ");
            System.out.println();

            boolean b = true;
            while (b){
                Students.studentDatabase();

                System.out.print("Enter your id :- ");
                String idNo = sc.next();
                if(Students.availS.contains(idNo)){
                    System.out.println();
                    System.out.println("Welcome "+idNo);
                    System.out.println("Add book in Library : Press 1");
                    System.out.println("Remove book from Library : Press 2");
                    System.out.println("Issue book from Library : Press 3");
                    System.out.println("Add student in Student Database : Press 4");
                    System.out.println("Record of available books in Library : Press 5");
                    System.out.println("Record of Student Database : Press 6");
                    System.out.println();
                    int choose1 = sc.nextInt();

                    if (1 == choose1){
                        System.out.print("Enter name of book that u want to add :- ");
                        String addBook1 = sc.nextLine();
                        Books.addBook(addBook1);

                    }else if (2 == choose1){
                        System.out.print("Enter book that you want to remove :- ");
                        String removeBook1 = sc.nextLine();
                        Books.removeBook(removeBook1);
                        System.out.println(Books.availB);

                    }else if (3 == choose1){

                        System.out.print("Enter book that you want to issue from " +Books.availB + " :- " );
                        String issueBook1 = sc.next();
                        if(Books.availB.contains(issueBook1)){
                            System.out.println(idNo + " issued "+ issueBook1 + " from library..");
                        }else{
                            System.out.println("Book not available..");
                        }

                    }else if (4 == choose1){
                        System.out.print("Enter name :- ");
                        String newName = sc.next();
                        Students.addStudent(newName);
                        System.out.println(Students.availS);

                    }else if (5 == choose1){
                        System.out.println(Books.availB);

                    }else if (6 == choose1){
                        System.out.println(Students.availS);
                    }

                }else{
                    System.out.println("Enter a valid Id no. or Add it in Student Database");
                    System.out.println("Press 1 to add student");
                    int addStu1 = sc.nextInt();
                    if(1==addStu1){
                        System.out.print("Enter name :- ");
                        String newName = sc.next();
                        Students.addStudent(newName);
                        System.out.println(Students.availS);
                    }
                }

                System.out.println("Enter any integer to continue else 0 to stop");
                int choose = sc.nextInt();
                if (0 == choose){
                    break;
                }

            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input");
        }
    }
}
