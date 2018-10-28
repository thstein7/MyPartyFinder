package com.example.thste.mypartyfinder;

import android.provider.BaseColumns;

public final class PartyAppContract {
    private PartyAppContract() {}

    public static class PartyAppEntry implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String EMAIL_ADDRESS = "email";
        public static final String USERNAME = "username";
        public static final String PASSWORD = "password";
        public static final String PARTY_LIST = "partylist";
    }

    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + PartyAppEntry._ID
            + " INTEGER PRIMARY KEY," + PartyAppEntry.EMAIL_ADDRESS + " TEXT,"
            + PartyAppEntry.USERNAME + " TEXT," + PartyAppEntry.PASSWORD + " BLOB,"
            + PartyAppEntry.PARTY_LIST + " SET";
    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + PartyAppEntry.TABLE_NAME;

}
