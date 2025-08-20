package com.projetos_java.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos_java.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
