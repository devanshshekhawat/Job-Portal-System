package com.devansh.job_portal.job_portal_backend.Model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class user {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@Column(unique = true, nullable = false)
private String username;


@Column(nullable = false)
private String password;


@Column(nullable = false)
private String email;


@Enumerated(EnumType.STRING)
private role role;
}
