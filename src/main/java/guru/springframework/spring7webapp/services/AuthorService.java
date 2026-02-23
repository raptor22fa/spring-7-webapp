package guru.springframework.spring7webapp.services;

import guru.springframework.spring7webapp.domain.Author;

/**
 *
 * @author Raptor
 */
public interface AuthorService {

    Iterable<Author> findAll();

}
