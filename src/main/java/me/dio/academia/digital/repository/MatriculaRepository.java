package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.Matricula;
@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>  {

    List<Matricula> findByAlunoBairro(String bairro);
}
