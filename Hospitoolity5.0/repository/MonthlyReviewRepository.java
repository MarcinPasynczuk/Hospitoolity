package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.MonthlyReview;


@Repository
public interface MonthlyReviewRepository extends JpaRepository<MonthlyReview, Integer>{

}
