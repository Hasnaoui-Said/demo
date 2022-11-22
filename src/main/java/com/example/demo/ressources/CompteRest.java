package com.example.demo.ressources;

import com.example.demo.entity.Compte;
import com.example.demo.service.CompteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-banque/v1/compte")
public class CompteRest {

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return compteService.deleteByRef(ref);
    }

    @GetMapping("/ref/{ref}")
    public Compte findByRefsLike(@PathVariable String ref) {
        return compteService.findByRef(ref);
    }

    @GetMapping("/name/{name}/solde/{solde}")
    public List<Compte> findByNamesLikeAndSoldeGreaterThan(@PathVariable String name,@PathVariable long solde) {
        return compteService.findByNamesLikeAndSoldeGreaterThan(name, solde);
    }


    @GetMapping("/")
    public List<Compte> findAll() {
        return compteService.findAll();
    }

    @GetMapping("/one/l")
    public Compte getOne(@PathVariable Long l) {
        return compteService.getOne(l);
    }

    @PostMapping("/")
    public Compte save(@RequestBody Compte compte) {
        return compteService.save(compte);
    }

    @Autowired
    CompteServiceImp compteService;
}
