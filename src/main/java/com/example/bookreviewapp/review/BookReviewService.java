package com.example.bookreviewapp.review;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookReviewService {
    List<ReviewResponse> getAllReviews(Integer size, String orderBy);

    List<BookReviewStatisticResponse> getReviewStatistics();

    Long createBookReview(String isbn, BookReviewRequest bookReviewRequest, String email);

    void deleteReview(String bookIsbn, long bookReviewId);
}
