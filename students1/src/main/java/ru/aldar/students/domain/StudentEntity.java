package ru.aldar.students.domain;

import javax.persistence.*;

/**
 * Created by AldarTS on 19.04.2017.
 */
@Entity
@Table(name = "student", schema = "students", catalog = "")
public class StudentEntity {
    private int idStudent;
    private String fio;
    private int idCity;

    @Id
    @Column(name = "id_student", nullable = false)
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic
    @Column(name = "fio", nullable = false, length = 120)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Basic
    @Column(name = "id_city", nullable = false)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (idStudent != that.idStudent) return false;
        if (idCity != that.idCity) return false;
        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStudent;
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + idCity;
        return result;
    }
}
