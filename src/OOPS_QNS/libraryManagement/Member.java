package OOPS_QNS.libraryManagement;

import java.util.HashMap;

public class Member {
    private static long idCounter = 0;
    private long memberId;
    private String name;
    private HashMap<Long, Book> borrowedBooks;

    public Member(String _name){
        this.name = _name;
        idCounter += 1;
        this.memberId = idCounter;
        this.borrowedBooks = new HashMap<>();
    }


    public void borrowBook(Book book){
        if(this.borrowedBooks.size() >= 4){
            System.out.println("Members can't borrow more than 4 books");
            return;
        }

        if (borrowedBooks.containsKey(book.getBookSerialNo())) {
            System.out.println("Book already borrowed by this member");
            return;
        }
        borrowedBooks.put(book.getBookSerialNo(), book);
    }

    public void returnBook(long serialNum){
        borrowedBooks.remove(serialNum);
    }

    public HashMap<Long, Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

}
