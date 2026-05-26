package com.issuetracker.repository;

import com.issuetracker.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {

    List<Issue> findByStatus(String status);
    List<Issue> findByPriority(String priority);
    List<Issue> findByReportedBy(String reportedBy);

}