package com.example.demo.dao;

import com.example.demo.entity.Compte;
import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteDao extends JpaRepository<Compte, Long> {
    int deleteByRef(String ref);
    Compte findByRef(String ref);
    List<Compte> findByNamesLikeAndSoldeGreaterThan(String name, long solde);
}
