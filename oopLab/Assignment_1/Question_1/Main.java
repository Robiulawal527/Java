import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner inputReference =new Scanner(System.in);
     Book[] booksRef= new Book[5];

     for(int i=0; i<booksRef.length; i++){
         System.out.println("Enter Details for Book: "+(i+1));
         System.out.print("Enter ISBN Number: ");
         int ISBN = inputReference.nextInt();
         inputReference.nextLine();
         System.out.print("Enter Title of the book : ");
         String bookTitle = inputReference.nextLine();
         System.out.print("Enter Number of Pages: ");
         int numberOfPages = inputReference.nextInt();

         booksRef[i]= new Book(ISBN, bookTitle, numberOfPages);

     }

     inputReference.close();

     displayAll(booksRef);
        System.out.println("Comparison of Book 1 and 2:");
        int compareResult=booksRef[0].compareTo(booksRef[1]);
        System.out.println("Comparison result: "+compareResult);

        for(int i=0;i<booksRef.length;i++) {
            System.out.printf("\n Checking the book %d : \n" ,i+1);
            boolean isHeavierResult = isHeavier(booksRef[i]);
            System.out.printf("Is book %d is heavier than 500?: %b" ,i+1, isHeavierResult);
        }

    }

    public static void displayAll(Book[] books){
        for(Book book: books) {
            System.out.println(book.toString());
        }
    }

    public static boolean isHeavier(Book book){
        if(book.getNumberOfPages()>500){
            return true;
        }
        else{
            return false;
        }
    }

    
}