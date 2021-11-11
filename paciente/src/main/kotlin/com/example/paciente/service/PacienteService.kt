package com.example.paciente.service

import com.example.paciente.model.Paciente
import com.example.paciente.repository.PacienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class PacienteService {
    @Autowired
    lateinit var pacienteRepository: PacienteRepository
    fun list(): List<Paciente> {
        return pacienteRepository.findAll()
    }
    fun save(paciente: Paciente): Paciente {
        return pacienteRepository.save(paciente)
    }
    fun update(paciente: Paciente):Paciente{
        return  pacienteRepository.save(paciente)
    }

    fun updateDescription (paciente: Paciente):Paciente {
        val response = pacienteRepository.findById(paciente.id)
                ?: throw Exception()
        response.apply {
            this.nombre=paciente.nombre
        }
        return pacienteRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        pacienteRepository.deleteById(id)
        return true
    }
}