package csd226.repositories;

import csd226.data.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Integer> {
    List<Registry> findByRegistryKey(String registryKey);
}

