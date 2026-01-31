package OOPS_QNS.libraryManagement;

import java.util.HashMap;

public class Library {
    private HashMap<Long, Book> books;

    public Library(){
        books = new HashMap<>();
    }

    public void addBook(String _name, String _author, String _year){
        Book newBook = new Book(_name, _author, _year);
        books.put(newBook.getBookSerialNo(), newBook);
    }

    public boolean checkAvailability(long serialNum){
        Book getBook = books.get(serialNum);

        if(getBook == null){
            System.out.println("Book not found");
            return false;
        }

        return getBook.isAvailabile();
    }



    public boolean issueBook(long serialNum, Member member){
        Book getBook = books.get(serialNum);

        if(getBook == null){
            System.out.println("Book not found");
            return false;
        }

        if(!getBook.isAvailabile()){
            System.out.println("Books not available, already issued");
            return false;
        }

        getBook.issue();
        member.borrowBook(getBook);
        return true;

    }
    public boolean returnBook(long serialNum, Member member){
        Book getBook = books.get(serialNum);

        if(getBook == null){
            System.out.println("Book not found");
            return false;
        }

        if(getBook.isAvailabile()){
            System.out.println("Books is already in library");
            return false;
        }

        getBook.returnBook();
        member.returnBook(serialNum);
        return true;
    }

}
