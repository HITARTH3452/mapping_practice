package com.geekster.Mapping_Practice.repositries;

import com.geekster.Mapping_Practice.models.Address;
import com.geekster.Mapping_Practice.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,Long> {
}
