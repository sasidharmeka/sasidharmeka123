package com.deloitte.lab4.ex3;

public class Lab4Ex3 {
    public static void main(String[] args) {
        Item[] items = new Item[5];

        items[0] = new Book("B001", "Effective Java", 5, "Joshua Bloch");
        items[1] = new JournalPaper("JP001", "AI Research", 3, "John Doe", 2022);
        items[2] = new Video("V001", "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        items[3] = new CD("C001", "The Dark Side of the Moon", 4, 42, "Pink Floyd", "Rock");
        items[4] = new JournalPaper("JP002", "Space Exploration", 2, "Jane Smith", 2021);

        for (Item item : items) {
            item.print();
        }
    }
}

