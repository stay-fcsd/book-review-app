package com.example.bookreviewapp.review;

import org.springframework.stereotype.Service;

import java.util.List;

public class BookReviewServiceImp implements BookReviewService{
    @Override
    public List<ReviewResponse> getAllReviews(Integer size, String orderBy) {
        System.out.println("IS THIS BEING PRINGTED");
        return null;
    }
}
