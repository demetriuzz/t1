/*
 * This file is generated by jOOQ.
 */
package ru.demetriuzz.t1.jooq.notes.t1_schema;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import ru.demetriuzz.t1.jooq.notes.t1_schema.tables.TNote;
import ru.demetriuzz.t1.jooq.notes.t1_schema.tables.records.TNoteRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * t1_schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TNoteRecord> T_NOTE_PKEY = Internal.createUniqueKey(TNote.T_NOTE, DSL.name("t_note_pkey"), new TableField[] { TNote.T_NOTE.C_ID }, true);
}
