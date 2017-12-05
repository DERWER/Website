package ru.koshevoy.service;

import com.sun.org.apache.regexp.internal.RE;
import javassist.compiler.ast.ASTList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import ru.koshevoy.model.Review;
import ru.koshevoy.repository.ReviewRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by koshevoy on 13.07.2017.
 */

@Service("reviewService")
@Repository
@Transactional
@Lazy
public class ReviewServiceImpl implements ReviewService {
    private static final Logger logger = LoggerFactory.getLogger(ReviewService.class);

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> findAll() {
        List reviews = new ArrayList();
        Iterable reviesIterable=reviewRepository.findAll();
        Iterator reviessIterator=reviesIterable.iterator();
        while(reviessIterator.hasNext())
        {
            reviews.add(reviessIterator.next());
        }
        return reviews;
    }

    public Review findById(Integer id) {
        return reviewRepository.findOne(id);
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public void delete(Review review) {
        reviewRepository.delete(review);
    }

}
