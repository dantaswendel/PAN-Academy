package com.wendel.microtabela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendel.microtabela.model.Tabela;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

}
