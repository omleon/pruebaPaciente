package com.example.paciente.controller

import com.example.paciente.model.Paciente
import com.example.paciente.service.PacienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/paciente")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class PacienteController {
    @Autowired
    lateinit var pacienteService: PacienteService

    @GetMapping
    fun list(): List<Paciente>{
        return pacienteService.list()
    }
    @PostMapping
    fun save(@RequestBody paciente: Paciente): Paciente{
        return pacienteService.save(paciente)
    }
    @PutMapping
    fun update (@RequestBody paciente: Paciente):Paciente{
        return pacienteService.update(paciente)
    }
    @PatchMapping
    fun updaateDescription (@RequestBody paciente: Paciente): Paciente{
        return  pacienteService.updateDescription(paciente)
    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id")id: Long):Boolean{
        return pacienteService.delete(id)
    }
}
