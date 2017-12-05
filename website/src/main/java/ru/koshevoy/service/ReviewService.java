package ru.koshevoy.service;

import ru.koshevoy.model.Review;


import java.util.List;

/**
 * Created by koshevoy on 13.07.2017.
 */
public interface ReviewService {
    List<Review> findAll();
    Review findById(Integer id);
    Review save(Review review);
    void delete(Review review);
}
