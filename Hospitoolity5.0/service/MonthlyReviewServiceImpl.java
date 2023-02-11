package main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.error.HospitoolityNotFoundException;
import main.model.MonthlyReview;
import main.repository.MonthlyReviewRepository;


@Service
@Transactional
public class MonthlyReviewServiceImpl implements MonthlyReviewService{

	@Autowired
	private MonthlyReviewRepository monthlyReviewRepository;
	
	@Override
	public List<MonthlyReview> getAll() {
		return monthlyReviewRepository.findAll();
	}

	@Override
	public MonthlyReview getById(int id) {
		return monthlyReviewRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(MonthlyReview monthlyReview) {
		monthlyReviewRepository.save(monthlyReview);
	}

	@Override
	public void delete(int id) {
		monthlyReviewRepository.deleteById(id);
	}

	}
