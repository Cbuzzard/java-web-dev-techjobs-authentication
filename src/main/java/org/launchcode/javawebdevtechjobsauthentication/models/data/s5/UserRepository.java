package org.launchcode.javawebdevtechjobsauthentication.models.data.s5;

import org.launchcode.javawebdevtechjobsauthentication.models.s5.Job;
import org.launchcode.javawebdevtechjobsauthentication.models.s5.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
