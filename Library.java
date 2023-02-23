import javax.lang.model.util.ElementScanner14;

public class Library {
    
    String name;
    Book [] books = new Book[4];
    boolean borrow;
    boolean borrowed;
    int j = 0;
    public Library(String n){
       name = n;
    }
    public String getName(){
      return name;
    }
    public void addBook(Book title){
      books[j] = title;
      j++;
    }
    public static void printOpeningHours(){
        System.out.println("Library is open daily from 9am to 5pm.");
    }
    public void printAddress(){
        System.out.println("UQU Abidyah");
    }
    public void printAvailableBooks(){
        int i = 0;
        if (books[0]==null)
        System.out.println("No book in catalog");
        else
        while(i<books.length){
        System.out.println(books[i].getTitle());
        i++;
        }
    }
    public void borrowBook(String bookTitle){
      int i = 0;
      Book taken = new Book("","",0);
      if(borrowed == false&&books.length!=0){
      while (i<books.length){
        if (bookTitle.equalsIgnoreCase(books[i].getTitle())){
        borrow = true;
        System.out.println("You have successfully borrowed: "+books[i].getTitle()+" Published by "+books[i].getAuthorName());
        books[i]=taken;
        if (borrow == true)
        break;
        }
        else{
        borrow = false;
        System.out.println("Sorry we do not have this book in our library");
        }
        i++;
      }
      
    }
      
      if(borrow==true)
        borrowed = true;
    }
    public void returnBook(Book bookName){
        books[0] = bookName;
    }
    
   }
