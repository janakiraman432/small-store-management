package net.code.server.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import net.code.server.model.storeData;

@Repository
@EnableJpaRepositories
public interface storeRepository extends JpaRepository<storeData,Long>{

    void deleteById(Long id);
    
}