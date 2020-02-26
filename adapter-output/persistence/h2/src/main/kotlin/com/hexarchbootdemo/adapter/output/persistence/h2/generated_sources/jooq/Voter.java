/*
 * This file is generated by jOOQ.
 */
package com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq;


import com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.FlywaySchemaHistory;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Voter extends SchemaImpl {

    private static final long serialVersionUID = -1862640891;

    /**
     * The reference instance of <code>VOTER</code>
     */
    public static final Voter VOTER = new Voter();

    /**
     * The table <code>VOTER.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>VOTER.VOTER</code>.
     */
    public final com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.Voter VOTER_ = com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.Voter.VOTER_;

    /**
     * No further instances allowed
     */
    private Voter() {
        super("VOTER", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.Voter.VOTER_);
    }
}