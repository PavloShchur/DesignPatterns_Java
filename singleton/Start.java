package com.pavlo.singleton;

public class Start {

    public static void main(String[] args) {
    	Database database = Database.getInstance("Test");
    	database.editRecord("Edited");
    	database.editRecord("Edited 2");
    }
}
