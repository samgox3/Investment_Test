package org.samsun.investment_test.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Table(name = "school_ttp1")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;

    @Builder.Default
    private Integer maxPeople = 0;

    @Builder.Default
    private boolean alive = true;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
