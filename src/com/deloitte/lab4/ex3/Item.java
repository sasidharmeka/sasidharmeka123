package com.deloitte.lab4.ex3;

abstract class Item {
    private String id;
    private String title;
    private int copies;

    public Item(String id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.copies = copies;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public void checkOut() {
        if (copies > 0) {
            copies--;
        } else {
            System.out.println("No copies available for checkout.");
        }
    }

    public void checkIn() {
        copies++;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + copies;
    }

    public abstract void print();
}
