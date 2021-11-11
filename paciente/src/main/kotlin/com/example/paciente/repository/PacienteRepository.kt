package com.example.paciente.repository

import com.example.paciente.model.Paciente
import org.springframework.data.jpa.repository.JpaRepository

interface PacienteRepository : JpaRepository<Paciente, Long> {
    // interface WorkoutRepository:JpaRepository<Workout, Long> {}
    fun findById(id: Long?): Paciente?

}