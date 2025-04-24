/*package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Helpers.MessajeAPI;
import com.example.ClassRoomApp.Models.Professor;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;

public class ProfessorService {
    public List<Professor> ProfessorList() throws Exception {

    }

    public Professor searchProfessorById(Integer id) throws Exception {
        try {
            return this.Repository.findById(id)
                    .orElseThrow(() -> new Exception("User not found on Db"));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    //Método modificar
    public Professor modificarDocente(Integer id, Professor datosNuevosDocente) throws Exception{
        try{
            Optional<Professor> DocenteQueQuieroModificar = this.Repository.findById(id);
            if(DocenteQueQuieroModificar.isPresent()){
                //Modifico ese docente
                try {
                    DocenteQueQuieroModificar.get().setSpeciality(datosNuevosDocente.getSpeciality());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new Exception(MessajeAPI.ERROR_PROFESSOR_NO_ENCONTRADO.getMensaje());
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
*/