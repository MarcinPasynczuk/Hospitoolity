package main.service;

import java.util.List;

import main.model.MonthlyReview;



public interface MonthlyReviewService {

	public List<MonthlyReview> getAll();
	
	public MonthlyReview getById(int id);
	
	public void saveOrUpdate(MonthlyReview monthlyReview);
	
	public void delete(int id);
	
}
