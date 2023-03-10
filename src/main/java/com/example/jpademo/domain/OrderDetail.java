package com.example.jpademo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderdetails")
public class OrderDetail implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int orderDetailId;
  @Column(nullable = false)
  private int orderId;
  @Column(nullable = false)
  private int productId;
  @Column(nullable = false)
  private int quantity;
  @Column(nullable = false)
  private double unitPrice;
}
