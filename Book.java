public class Book {
    String title;
    String authorName;
    int publishDate;
    boolean borrowed;
    public Book(String bookTitle, String name, int date) {
   
    this.title = bookTitle;
    this.authorName = name;
    this.publishDate = date;

    }
    public void borrow() {
    
    borrowed = true;
    }
    
    public void returnToLibrary() {
   
    borrowed = false;
    }
 
    public boolean isBorrowed() {

    if (borrowed == true)
    return true;
    else
    return false;
    }

    public String getTitle() {

    return title;
    }
    public String getAuthorName(){
        return authorName;
    }
    public int getPublshDate(){
        return publishDate;
    }
}