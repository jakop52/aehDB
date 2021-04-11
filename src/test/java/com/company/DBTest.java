package com.company;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DBTest {
private DB db;
    @BeforeEach
    public void setUp() throws Exception {
        db = new DB();
    }
    @org.junit.jupiter.api.Test
    void getCOSTAM() {
        assertEquals("Jan Kowalski", db.getCOSTAM("test_aeh_students"));
    }
}