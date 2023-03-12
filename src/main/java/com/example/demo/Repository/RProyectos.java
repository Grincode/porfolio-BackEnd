package com.example.demo.Repository;

import com.example.demo.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Grincode
 */
    @Repository
    public interface RProyectos extends JpaRepository<Proyectos, Integer> {

        public Optional<Proyectos> findByNombreP(String nombreP);

        public boolean existsByNombreP(String nombreP);
    }


