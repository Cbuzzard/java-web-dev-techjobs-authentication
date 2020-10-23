package org.launchcode.javawebdevtechjobsauthentication.models.data.s5;

import org.launchcode.javawebdevtechjobsauthentication.models.s5.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface JobRepository extends CrudRepository<Job, Integer> {
}

