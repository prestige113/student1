package ru.aldar.students.domain;

import javax.persistence.*;

/**
 * Created by AldarTS on 19.04.2017.
 */
@Entity
@Table(name = "city", schema = "students", catalog = "")
public class CityEntity {
    private int idCity;
    private String cityName;
    private int idRegion;

    @Id
    @Column(name = "id_city", nullable = false)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "city_name", nullable = false, length = 80)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "id_region", nullable = false)
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (idCity != that.idCity) return false;
        if (idRegion != that.idRegion) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCity;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + idRegion;
        return result;
    }
}
