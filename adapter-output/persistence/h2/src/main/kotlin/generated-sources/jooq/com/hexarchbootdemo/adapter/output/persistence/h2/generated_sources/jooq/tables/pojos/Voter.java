/*
 * This file is generated by jOOQ.
 */
package com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos;


import java.io.Serializable;
import java.util.UUID;

import javax.annotation.Generated;


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
public class Voter implements Serializable {

    private static final long serialVersionUID = 1390404167;

    private final UUID   id;
    private final String firstName;
    private final String lastName;

    public Voter(Voter value) {
        this.id = value.id;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
    }

    public Voter(
        UUID   id,
        String firstName,
        String lastName
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Voter (");

        sb.append(id);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);

        sb.append(")");
        return sb.toString();
    }
}
