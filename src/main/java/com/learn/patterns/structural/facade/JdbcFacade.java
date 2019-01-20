package com.learn.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * A facade to wrap possibly complicated jdbc code.
 */

public class JdbcFacade {

    DBSingleton db;

    public JdbcFacade() {
        this.db = DBSingleton.getInstance();
    }

    public int createTable() {

        // do all the jdbc work with DBSingleton
        return 1;
    }

    public int insertIntoTable() {
        // do all the complex jdbc work with DBSingleton
        return -1;
    }
    public List<Address> getAddresses() {
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address("1 main st", "New York, NY", "10011"));
        return addresses;
    }
}
