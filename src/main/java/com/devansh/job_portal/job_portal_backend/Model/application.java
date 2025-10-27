package com.devansh.job_portal.job_portal_backend.Model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class application {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "job_id")
private job job;


@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "user_id")
private user user;


@Enumerated(EnumType.STRING)
private appstatus status;


private LocalDateTime appliedAt;
}
