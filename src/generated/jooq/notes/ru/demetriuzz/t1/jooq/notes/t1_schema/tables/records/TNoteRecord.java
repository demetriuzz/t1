/*
 * This file is generated by jOOQ.
 */
package ru.demetriuzz.t1.jooq.notes.t1_schema.tables.records;


import java.time.LocalDate;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.demetriuzz.t1.jooq.notes.t1_schema.tables.TNote;


/**
 * Таблица записей - ежедневник
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TNoteRecord extends UpdatableRecordImpl<TNoteRecord> implements Record4<Long, LocalDate, LocalTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>t1_schema.t_note.c_id</code>. Уникальный идентификатор
     * записи
     */
    public void setCId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>t1_schema.t_note.c_id</code>. Уникальный идентификатор
     * записи
     */
    public Long getCId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>t1_schema.t_note.c_day</code>. Когда сделать
     */
    public void setCDay(LocalDate value) {
        set(1, value);
    }

    /**
     * Getter for <code>t1_schema.t_note.c_day</code>. Когда сделать
     */
    public LocalDate getCDay() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>t1_schema.t_note.c_time</code>. Во сколько сделать
     */
    public void setCTime(LocalTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>t1_schema.t_note.c_time</code>. Во сколько сделать
     */
    public LocalTime getCTime() {
        return (LocalTime) get(2);
    }

    /**
     * Setter for <code>t1_schema.t_note.c_todo</code>. Что сделать
     */
    public void setCTodo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>t1_schema.t_note.c_todo</code>. Что сделать
     */
    public String getCTodo() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, LocalDate, LocalTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, LocalDate, LocalTime, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TNote.T_NOTE.C_ID;
    }

    @Override
    public Field<LocalDate> field2() {
        return TNote.T_NOTE.C_DAY;
    }

    @Override
    public Field<LocalTime> field3() {
        return TNote.T_NOTE.C_TIME;
    }

    @Override
    public Field<String> field4() {
        return TNote.T_NOTE.C_TODO;
    }

    @Override
    public Long component1() {
        return getCId();
    }

    @Override
    public LocalDate component2() {
        return getCDay();
    }

    @Override
    public LocalTime component3() {
        return getCTime();
    }

    @Override
    public String component4() {
        return getCTodo();
    }

    @Override
    public Long value1() {
        return getCId();
    }

    @Override
    public LocalDate value2() {
        return getCDay();
    }

    @Override
    public LocalTime value3() {
        return getCTime();
    }

    @Override
    public String value4() {
        return getCTodo();
    }

    @Override
    public TNoteRecord value1(Long value) {
        setCId(value);
        return this;
    }

    @Override
    public TNoteRecord value2(LocalDate value) {
        setCDay(value);
        return this;
    }

    @Override
    public TNoteRecord value3(LocalTime value) {
        setCTime(value);
        return this;
    }

    @Override
    public TNoteRecord value4(String value) {
        setCTodo(value);
        return this;
    }

    @Override
    public TNoteRecord values(Long value1, LocalDate value2, LocalTime value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TNoteRecord
     */
    public TNoteRecord() {
        super(TNote.T_NOTE);
    }

    /**
     * Create a detached, initialised TNoteRecord
     */
    public TNoteRecord(Long cId, LocalDate cDay, LocalTime cTime, String cTodo) {
        super(TNote.T_NOTE);

        setCId(cId);
        setCDay(cDay);
        setCTime(cTime);
        setCTodo(cTodo);
    }

    /**
     * Create a detached, initialised TNoteRecord
     */
    public TNoteRecord(ru.demetriuzz.t1.jooq.notes.t1_schema.tables.pojos.TNote value) {
        super(TNote.T_NOTE);

        if (value != null) {
            setCId(value.getCId());
            setCDay(value.getCDay());
            setCTime(value.getCTime());
            setCTodo(value.getCTodo());
        }
    }
}