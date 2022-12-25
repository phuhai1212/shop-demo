package com.example.jpademo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int productId;
  @Column(columnDefinition = "nvarchar(100) not null")
  private String name;
  @Column(nullable = false)
  private int quantity;
  @Column(length = 200)
  private String image;
  @Column(nullable = false)
  private double unitPrice;
  @Column(nullable = false)
  private double discount;
  @Column(columnDefinition = "nvarchar(500) not null")
  private String description;
  @Temporal(TemporalType.DATE)
  private Date enteredDate;
  @Column(nullable = false)
  private short status;
  @Column(nullable = false)
  private int categoryId;

}
