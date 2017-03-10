package com.tts.scores;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "scores", path = "scores")
public interface ScoresRepository extends PagingAndSortingRepository<Scores, Long> {
		List<Scores> findBySfId(@Param("sfId") String sfId);
	
}
