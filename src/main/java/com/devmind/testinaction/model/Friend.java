package com.devmind.testinaction.model;

import java.time.LocalDate;

/**
 * @author devmind
 */
public class Friend {

    private Long id;
    private String name;
    private LocalDate birthday;

    public Friend(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
