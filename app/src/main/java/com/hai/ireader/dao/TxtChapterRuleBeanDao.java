package com.hai.ireader.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.hai.ireader.bean.TxtChapterRuleBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TXT_CHAPTER_RULE_BEAN".
*/
public class TxtChapterRuleBeanDao extends AbstractDao<TxtChapterRuleBean, String> {

    public static final String TABLENAME = "TXT_CHAPTER_RULE_BEAN";

    /**
     * Properties of entity TxtChapterRuleBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Name = new Property(0, String.class, "name", true, "NAME");
        public final static Property Rule = new Property(1, String.class, "rule", false, "RULE");
        public final static Property SerialNumber = new Property(2, Integer.class, "serialNumber", false, "SERIAL_NUMBER");
        public final static Property Enable = new Property(3, Boolean.class, "enable", false, "ENABLE");
    }


    public TxtChapterRuleBeanDao(DaoConfig config) {
        super(config);
    }
    
    public TxtChapterRuleBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TXT_CHAPTER_RULE_BEAN\" (" + //
                "\"NAME\" TEXT PRIMARY KEY NOT NULL ," + // 0: name
                "\"RULE\" TEXT," + // 1: rule
                "\"SERIAL_NUMBER\" INTEGER," + // 2: serialNumber
                "\"ENABLE\" INTEGER);"); // 3: enable
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TXT_CHAPTER_RULE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TxtChapterRuleBean entity) {
        stmt.clearBindings();
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(1, name);
        }
 
        String rule = entity.getRule();
        if (rule != null) {
            stmt.bindString(2, rule);
        }
 
        Integer serialNumber = entity.getSerialNumber();
        if (serialNumber != null) {
            stmt.bindLong(3, serialNumber);
        }
 
        Boolean enable = entity.getEnable();
        if (enable != null) {
            stmt.bindLong(4, enable ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TxtChapterRuleBean entity) {
        stmt.clearBindings();
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(1, name);
        }
 
        String rule = entity.getRule();
        if (rule != null) {
            stmt.bindString(2, rule);
        }
 
        Integer serialNumber = entity.getSerialNumber();
        if (serialNumber != null) {
            stmt.bindLong(3, serialNumber);
        }
 
        Boolean enable = entity.getEnable();
        if (enable != null) {
            stmt.bindLong(4, enable ? 1L: 0L);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public TxtChapterRuleBean readEntity(Cursor cursor, int offset) {
        TxtChapterRuleBean entity = new TxtChapterRuleBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // name
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // rule
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // serialNumber
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0 // enable
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TxtChapterRuleBean entity, int offset) {
        entity.setName(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setRule(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSerialNumber(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setEnable(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
     }
    
    @Override
    protected final String updateKeyAfterInsert(TxtChapterRuleBean entity, long rowId) {
        return entity.getName();
    }
    
    @Override
    public String getKey(TxtChapterRuleBean entity) {
        if(entity != null) {
            return entity.getName();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TxtChapterRuleBean entity) {
        return entity.getName() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}