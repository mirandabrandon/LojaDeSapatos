package com.brandontech.lojadesapatos.repository.impl;

import com.brandontech.lojadesapatos.model.SapatoDAO;
import com.brandontech.lojadesapatos.repository.SapatoRepository;

import java.util.Optional;

public class SapatoRepositoryImpl implements SapatoRepository {
    @Override
    public SapatoDAO findByName(String name) {
        return null;
    }

    @Override
    public <S extends SapatoDAO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends SapatoDAO> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<SapatoDAO> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<SapatoDAO> findAll() {
        return null;
    }

    @Override
    public Iterable<SapatoDAO> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(SapatoDAO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends SapatoDAO> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
