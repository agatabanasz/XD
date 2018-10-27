package com.company;

import java.util.Objects;

public class osoby {
    private String name;
    private int wiek;
    private GenderTypEnumeracyjny gender;

    public osoby(GenderTypEnumeracyjny gender) {
        this.gender = gender;
    }

    public osoby(String name, int wiek) {
        this.name = name;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        osoby osoby = (osoby) o;
        return wiek == osoby.wiek &&
                Objects.equals(name, osoby.name) &&
                gender == osoby.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wiek, gender);
    }

}
