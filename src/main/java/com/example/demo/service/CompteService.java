package com.example.demo.service;

import com.example.demo.entity.Compte;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompteService {
     int deleteByRef(String ref);
     Compte findByRef(String ref);
     List<Compte> findByNamesLikeAndSoldeGreaterThan(String name, long solde);
     List<Compte> findAll();
     Compte getOne(Long aLong);
     Compte save(Compte compte);

}
