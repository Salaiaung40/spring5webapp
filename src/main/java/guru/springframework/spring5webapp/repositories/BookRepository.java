package guru.springframework.spring5webapp.repositories;
//Create second clone a gin by Salai 6 May2021

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}