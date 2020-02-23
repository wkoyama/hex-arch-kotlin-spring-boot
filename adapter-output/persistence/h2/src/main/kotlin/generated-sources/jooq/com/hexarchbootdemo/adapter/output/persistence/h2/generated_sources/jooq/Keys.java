/*
 * This file is generated by jOOQ.
 */
package com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq;


import com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.FlywaySchemaHistory;
import com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.Voter;
import com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.records.FlywaySchemaHistoryRecord;
import com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.records.VoterRecord;

import javax.annotation.Generated;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<VoterRecord> VOTER_PKEY = UniqueKeys0.VOTER_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<VoterRecord> VOTER_PKEY = Internal.createUniqueKey(Voter.VOTER, "voter_pkey", new TableField[] { Voter.VOTER.ID }, true);
    }
}
