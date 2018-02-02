package com.riri.printresume;

import ch.qos.logback.core.joran.spi.NoAutoStart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Experience {

    @NotNull
    @Size(min = 4)
    private String company;

    @NotNull
    @Size(min = 4)
    private String position;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
