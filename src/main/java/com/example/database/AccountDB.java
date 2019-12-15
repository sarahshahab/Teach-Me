package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.entities.Account;

public class AccountDB extends SQLiteOpenHelper {

    private static String dbName ="PPSI.db";
    private static String tableName ="pengguna";
    private static String idColomn ="id";
    private static String usernameColomn ="username";
    private static String passwordColomn ="password";
    private static String nameColomn ="name";
    private static String emailColomn ="email";

    public static int DATABASE_VERSION=1;

    public AccountDB(Context context){
        super(context, dbName, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + tableName + "(" + idColomn + " integer primary key autoincrement," + usernameColomn + " text, " + passwordColomn + " text not null, " + nameColomn + "text," + emailColomn + "text not null" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        onCreate(sqLiteDatabase);

    }
    public boolean create (Account account){
        boolean result = true;
        try{
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(usernameColomn, account.getUsername());
            contentValues.put(passwordColomn, account.getPassword());
            contentValues.put(nameColomn, account.getName());
            contentValues.put(emailColomn, account.getEmail());
            result = sqLiteDatabase.insert(tableName,null,contentValues) > 0;
        } catch (Exception e){
            result = false;
        }
        return result;
    }

    public Account login (String username, String password){
        Account account = null;
        try {
            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            Cursor cursor = sqLiteDatabase.rawQuery("select * FROM " + tableName + " where username = ?  and password = ?", new String[]{username, password});
            if (cursor.moveToFirst()) {
                account = new Account();
                account.setId(cursor.getInt(0));
                account.setUsername(cursor.getString(1));
                account.setPassword(cursor.getString(2));
                account.setName(cursor.getString(3));
                account.setEmail(cursor.getString(4));
            }
        }
            catch (Exception e){
                account = null;
            }
            return account;
        }
    public Account checkUsername (String username){
        Account account = null;
        try {
            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            Cursor cursor = sqLiteDatabase.rawQuery("select * FROM " + tableName + " where username = ?", new String[]{username});
            if (cursor.moveToFirst()) {
                account = new Account();
                account.setId(cursor.getInt(0));
                account.setUsername(cursor.getString(1));
                account.setPassword(cursor.getString(2));
                account.setName(cursor.getString(3));
                account.setEmail(cursor.getString(4));
            }
        }
        catch (Exception e){
            account = null;
        }
        return account;
    }
    }
