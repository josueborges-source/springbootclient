package com.jayybe.project;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>{}
