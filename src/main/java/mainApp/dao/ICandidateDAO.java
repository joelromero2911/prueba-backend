package mainApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Candidate;

public interface ICandidateDAO extends JpaRepository<Candidate, Integer>{

	public List<Candidate> findByName(String name);
	public Candidate findByUsername(String username);
}
