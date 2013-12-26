package hello.Model.Repository;

import org.springframework.data.repository.CrudRepository;
public class TizmeRepository extends CrudRepository<Tizme, Long>{ Iterable<Tizme> findByTizmeName (String tizmeName);
    Iterable<Tizme> findByLogin (String login);
}
