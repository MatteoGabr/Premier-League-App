package com.football.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String>{

    void deleteByName(String playerName);

    Optional<Player> findByName(String name);
}
