public class TestLibrary{
    public static void main(String[] args){
        
        Library library = new Library("King Abdullah Library");
        Book one = new Book("Calculus made easy", "Mohammed", 2011);
        Book two = new Book("Human Body","Yusuf",1999);
        Book three = new Book("Space science","Jacob",2000);
        Book four = new Book("Cooking book","Jason",2003);
       
        
        library.addBook(one);
        library.addBook(two);
        library.addBook(three);
        library.addBook(four);
       
        Library.printOpeningHours();
        System.out.println("");
        System.out.println("You can reach us in");
        library.printAddress();
        System.out.println("");
       
       
        System.out.println("Books available in our library:");
        library.printAvailableBooks();
        System.out.println();
        
        System.out.println("Now borrowing Calculus made easy");
        library.borrowBook("Calculus made easy");
        
        System.out.println();
       
        
        System.out.println("Books available in our library:");
        library.printAvailableBooks();
        System.out.println();
       
       
        System.out.println("Returning Calculus made easy");
        library.returnBook(one);
        System.out.println();
       
        
        System.out.println("Books available in the library");
        library.printAvailableBooks();
        }
}
