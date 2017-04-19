package ru.aldar.students.domain;

import javax.persistence.*;

/**
 * Created by AldarTS on 19.04.2017.
 */
@Entity
@Table(name = "region", schema = "students", catalog = "")
public class RegionEntity {
    private int idRegion;
    private String regionName;
    private int idCountry;

    @Id
    @Column(name = "id_region", nullable = false)
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Basic
    @Column(name = "region_name", nullable = false, length = 80)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Basic
    @Column(name = "id_country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionEntity that = (RegionEntity) o;

        if (idRegion != that.idRegion) return false;
        if (idCountry != that.idCountry) return false;
        if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRegion;
        result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
        result = 31 * result + idCountry;
        return result;
    }
}
