package main.service;

import java.util.List;

import main.model.Problem;



public interface ProblemService {

	public List<Problem> getAll();
	
	public Problem getById(int id);
	
	public void saveOrUpdate(Problem problem);
	
	public void delete(int id);
	
	public List<Problem> getAllForNextMonth();
	
}
