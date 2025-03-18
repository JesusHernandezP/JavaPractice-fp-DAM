package com.examgenerator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Exam {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty(message = "El resumen teórico no puede estar vacío")
  @Size(max = 1000, message = "El resumen teórico no puede exceder los 1000 caracteres")
  private String theorySummary;

    @NotEmpty(message = "El examen generado no puede estar vacío")
    
  private String generatedExam;

  @NotNull(message = "La fecha de creación no puede ser nula")
  private LocalDateTime createdAt;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "exam")
  private List<Question> questions;

  // Getters y Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTheorySummary() {
    return theorySummary;
  }

  public void setTheorySummary(String theorySummary) {
    this.theorySummary = theorySummary;
  }

  public String getGeneratedExam() {
    return generatedExam;
  }

  public void setGeneratedExam(String generatedExam) {
    this.generatedExam = generatedExam;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }
}