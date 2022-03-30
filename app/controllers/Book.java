package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Book {
    private int isbn;
    private String title;
    private String sector;
    private String author;
    private String publisher;
    private int totalPages;
    private boolean isAvailable;
    private DateTime borrowedDate;
    private DateTime returnedDate;

    ConnectionClass connectionClass = new ConnectionClass();
    Connection connection = connectionClass.getConnection();

    public Book(){
    }

    public int getRowCount(){

        int countRow = 0;

        try{
            String query = "select count(*) from book";
            PreparedStatement st = connection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                countRow = rs.getInt("count(*)");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return countRow;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public DateTime getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(DateTime borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public DateTime getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(DateTime returnedDate) {
        this.returnedDate = returnedDate;
    }
}
