package org.samsun.investment_test.controller;

import java.util.List;

import org.samsun.investment_test.entity.School;
import org.samsun.investment_test.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    // 處理 GET 請求以獲取所有學校的資料
    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }
}
