package com.logrex.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "todos")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Todo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  int id;

    @Column(name = "title",nullable = false)
  private  String title;

    @Column(name = "descriptions",nullable = false)
  private  String descriotions;

    @Column(name = "completed")
  private  boolean completed;



}
