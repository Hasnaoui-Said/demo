package com.example.demo.ws;

import com.example.demo.entity.Compte;
import com.example.demo.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("gestion-banque/v1/compte")
public class CompteRest {

    @DeleteMapping("/ref{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return compteService.deleteByRef(ref);
    }

    @GetMapping("/ref{ref}")
    public Compte findByRef(String ref) {
        return compteService.findByRef(ref);
    }

    @("/ref{ref}")
    public List<Compte> findByNamesLikeAndSoldeGreaterThan(String name, long solde) {
        return compteService.findByNamesLikeAndSoldeGreaterThan(name, solde);
    }


    @GetMapping("/")
    public List<Compte> findAll() {
        return compteService.findAll();
    }

    @GetMapping("ref{}")
    public Compte getOne(Long l) {
        return compteService.getOne(l);
    }

    public int save(Compte compte) {
        return compteService.save(compte);
    }

    @Autowired
    CompteService compteService;
}
