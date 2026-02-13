package cmtv.springframework.spring7webapp.repositories;

import cmtv.springframework.spring7webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author, Long> {

}
