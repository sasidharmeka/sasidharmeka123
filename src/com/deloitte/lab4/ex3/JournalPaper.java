package com.deloitte.lab4.ex3;

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(String id, String title, int copies, String author, int yearPublished) {
        super(id, title, copies, author);
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper: " + this);
    }
}
