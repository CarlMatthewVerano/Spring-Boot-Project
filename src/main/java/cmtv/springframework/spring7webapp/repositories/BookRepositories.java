package cmtv.springframework.spring7webapp.repositories;

import cmtv.springframework.spring7webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book, Long> {

}
