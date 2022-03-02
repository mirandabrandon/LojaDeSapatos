package com.brandontech.lojadesapatos.repository;

import com.brandontech.lojadesapatos.model.SapatoDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SapatoRepository extends CrudRepository<SapatoDAO, Long> {

    public SapatoDAO findByName(String name);
}
