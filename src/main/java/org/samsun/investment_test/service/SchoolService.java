package org.samsun.investment_test.service;

import java.util.List;

import org.samsun.investment_test.entity.School;
import org.samsun.investment_test.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    SchoolRepository schoolRepo;

    public List<School> getAllSchools(){
       return  schoolRepo.findAll();
    }
}
