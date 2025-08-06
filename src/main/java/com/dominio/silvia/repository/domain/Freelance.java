package com.dominio.silvia.repository.domain;
import jakarta.persistence.*;


@Entity
@Table(name = "FREELANCE")
public class Freelance{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ID_FREELANCE")
    private Long idFreelance;

    @Column(name = "ID_EMP")
    private Long idEmp;
    @Column(name = "VALOR_HORAS")
    private Long valorHoras;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFreelance() {
        return idFreelance;
    }
    public void setIdFreelance(Long idFreelance) {
        this.idFreelance = idFreelance;
    }
   public Long getValorHoras() {
        return valorHoras;
   }
   public void setValorHoras(Long valorHoras) {
       this.valorHoras = valorHoras;
   }

    @Override
    public String toString() {
        return "Freelance{" +
                "id=" + id +
                ", idFreelance=" + idFreelance +
                ", idEmp=" + idEmp +
                ", valorHoras=" + valorHoras +
                '}';
    }
}
