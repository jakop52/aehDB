package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	DB db = new DB();
	System.out.println(db.getCOSTAM("test_aeh_students"));
    }
}
