package com.example.paciente.model

import javax.persistence.*


@Entity
@Table(name = "paciente")
class Paciente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var sintoma: String? = null
}