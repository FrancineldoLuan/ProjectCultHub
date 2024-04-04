package br.com.fiap.culthub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.culthub.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
