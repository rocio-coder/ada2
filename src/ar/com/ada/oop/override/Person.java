package ar.com.ada.oop.override;

import java.util.Objects;

import static java.util.Objects.hash;

public class Person {

    public String name;
    public String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,  this.lastname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else
            return false;

    }

    @Override
    public String toString() {
        return name + lastname;
    }
}
