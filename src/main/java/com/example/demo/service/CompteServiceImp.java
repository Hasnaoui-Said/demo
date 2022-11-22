package com.example.demo.service;

import com.example.demo.repository.CompteDao;
import com.example.demo.entity.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CompteService {
    @Transactional
    public int deleteByRef(String ref) {
        return compteDao.deleteByRef(ref);
    }

    public Compte findByRef(String ref) {
        return compteDao.findByRef(ref);
    }

    public List<Compte> findByNamesLikeAndSoldeGreaterThan(String name, long solde) {
        return compteDao.findByNamesLikeAndSoldeGreaterThan(name, solde);
    }

    public List<Compte> findAll() {
        return compteDao.findAll();
    }

    @Deprecated
    public Compte getOne(Long aLong) {
        return compteDao.getOne(aLong);
    }

    public int save(Compte compte) {
        Compte  compte1 = this.findByRef(compte.getRef());
        if(compte1 != null) return  -1;

        compteDao.save(compte);
        return 1;
    }

    @Autowired
    CompteDao compteDao;

}
