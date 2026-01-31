package OOPS_QNS.libraryManagement;

public class Book {
    private String name, author, yearPublished;
    private long bookSerialNo;
    private boolean isAvailable;
    private static long serialCounter = 0;

    public Book(String _name, String _author, String _year){
        this.name = _name;
        this.author = _author;
        this.yearPublished = _year;
        this.isAvailable = true;
        serialCounter+=1;
        this.bookSerialNo = serialCounter;
    }

    public boolean isAvailabile(){
        return this.isAvailable;
    }

    public long getBookSerialNo(){
        return this.bookSerialNo;
    }

    public void issue(){
        this.isAvailable = false;
    }

    public void returnBook(){
        this.isAvailable = true;
    }

}
