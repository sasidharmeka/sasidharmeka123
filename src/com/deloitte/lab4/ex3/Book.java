package com.deloitte.lab4.ex3;

class Book extends WrittenItem {
    public Book(String id, String title, int copies, String author) {
        super(id, title, copies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + this);
    }
}

