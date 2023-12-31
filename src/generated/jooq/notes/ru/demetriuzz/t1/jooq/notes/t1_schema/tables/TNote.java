/*
 * This file is generated by jOOQ.
 */
package ru.demetriuzz.t1.jooq.notes.t1_schema.tables;


import java.time.LocalDate;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.demetriuzz.t1.jooq.notes.t1_schema.Keys;
import ru.demetriuzz.t1.jooq.notes.t1_schema.T1Schema;
import ru.demetriuzz.t1.jooq.notes.t1_schema.tables.records.TNoteRecord;


/**
 * Таблица записей - ежедневник
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TNote extends TableImpl<TNoteRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>t1_schema.t_note</code>
     */
    public static final TNote T_NOTE = new TNote();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TNoteRecord> getRecordType() {
        return TNoteRecord.class;
    }

    /**
     * The column <code>t1_schema.t_note.c_id</code>. Уникальный идентификатор
     * записи
     */
    public final TableField<TNoteRecord, Long> C_ID = createField(DSL.name("c_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Уникальный идентификатор записи");

    /**
     * The column <code>t1_schema.t_note.c_day</code>. Когда сделать
     */
    public final TableField<TNoteRecord, LocalDate> C_DAY = createField(DSL.name("c_day"), SQLDataType.LOCALDATE, this, "Когда сделать");

    /**
     * The column <code>t1_schema.t_note.c_time</code>. Во сколько сделать
     */
    public final TableField<TNoteRecord, LocalTime> C_TIME = createField(DSL.name("c_time"), SQLDataType.LOCALTIME(6), this, "Во сколько сделать");

    /**
     * The column <code>t1_schema.t_note.c_todo</code>. Что сделать
     */
    public final TableField<TNoteRecord, String> C_TODO = createField(DSL.name("c_todo"), SQLDataType.VARCHAR, this, "Что сделать");

    private TNote(Name alias, Table<TNoteRecord> aliased) {
        this(alias, aliased, null);
    }

    private TNote(Name alias, Table<TNoteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица записей - ежедневник"), TableOptions.table());
    }

    /**
     * Create an aliased <code>t1_schema.t_note</code> table reference
     */
    public TNote(String alias) {
        this(DSL.name(alias), T_NOTE);
    }

    /**
     * Create an aliased <code>t1_schema.t_note</code> table reference
     */
    public TNote(Name alias) {
        this(alias, T_NOTE);
    }

    /**
     * Create a <code>t1_schema.t_note</code> table reference
     */
    public TNote() {
        this(DSL.name("t_note"), null);
    }

    public <O extends Record> TNote(Table<O> child, ForeignKey<O, TNoteRecord> key) {
        super(child, key, T_NOTE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : T1Schema.T1_SCHEMA;
    }

    @Override
    public Identity<TNoteRecord, Long> getIdentity() {
        return (Identity<TNoteRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TNoteRecord> getPrimaryKey() {
        return Keys.T_NOTE_PKEY;
    }

    @Override
    public TNote as(String alias) {
        return new TNote(DSL.name(alias), this);
    }

    @Override
    public TNote as(Name alias) {
        return new TNote(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TNote rename(String name) {
        return new TNote(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TNote rename(Name name) {
        return new TNote(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, LocalDate, LocalTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
