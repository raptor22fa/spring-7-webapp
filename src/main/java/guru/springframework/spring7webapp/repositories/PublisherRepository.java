package guru.springframework.spring7webapp.repositories;

import guru.springframework.spring7webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Raptor
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
