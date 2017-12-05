package ru.koshevoy.repository;

import org.springframework.data.repository.CrudRepository;
import ru.koshevoy.model.Review;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
    //List<Review> findByUserName(String username);
}
