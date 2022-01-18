package de.funnyco.acreexample.Hash;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashRepository extends CrudRepository<SimpleHash, String> {}
