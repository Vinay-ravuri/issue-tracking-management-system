package com.issuetracker.service;

import com.issuetracker.model.Issue;
import com.issuetracker.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IssueService {

    @Autowired
    private IssueRepository issueRepository;

    public Issue createIssue(Issue issue) {
        return issueRepository.save(issue);
    }

    public List<Issue> getAllIssues() {
        return issueRepository.findAll();
    }

    public Optional<Issue> getIssueById(Long id) {
        return issueRepository.findById(id);
    }

    public Issue updateIssue(Long id, Issue updatedIssue) {
        Issue existing = issueRepository.findById(id).orElseThrow();
        existing.setTitle(updatedIssue.getTitle());
        existing.setDescription(updatedIssue.getDescription());
        existing.setStatus(updatedIssue.getStatus());
        existing.setPriority(updatedIssue.getPriority());
        return issueRepository.save(existing);
    }

    public void deleteIssue(Long id) {
        issueRepository.deleteById(id);
    }

    public List<Issue> getByStatus(String status) {
        return issueRepository.findByStatus(status);
    }
}