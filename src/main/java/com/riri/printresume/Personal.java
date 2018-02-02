package com.riri.printresume;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Personal {

    @NotNull
    @Size(min=4)
    private int name;

    @NotNull
    @Size(min=4)
    private int email;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
