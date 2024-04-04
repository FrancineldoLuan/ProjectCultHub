package br.com.fiap.culthub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.culthub.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
