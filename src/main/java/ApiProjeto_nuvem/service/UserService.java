package ApiProjeto_nuvem.service;

import ApiProjeto_nuvem.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
