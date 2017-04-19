package ru.aldar.students.domain;

import javax.persistence.*;

/**
 * Created by AldarTS on 19.04.2017.
 */
@Entity
@Table(name = "country", schema = "students", catalog = "")
public class CountryEntity {
    private int idCountry;
    private String countryName;

    @Id
    @Column(name = "id_country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Basic
    @Column(name = "country_name", nullable = false, length = 80)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (idCountry != that.idCountry) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCountry;
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        return result;
    }
}
