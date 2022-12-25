package com.example.jpademo.service.impl;

import com.example.jpademo.domain.Category;
import com.example.jpademo.repository.CategoryRepo;
import com.example.jpademo.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
  CategoryRepo categoryRepo;

  public CategoryServiceImpl(CategoryRepo categoryRepo){
    this.categoryRepo = categoryRepo;
  }

  @Override
  public void flush() {
    categoryRepo.flush();
  }

  @Override
  public <S extends Category> S saveAndFlush(S entity) {
    return categoryRepo.saveAndFlush(entity);
  }

  @Override
  public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
    return categoryRepo.saveAllAndFlush(entities);
  }

  @Override
  public void deleteAllInBatch(Iterable<Category> entities) {
    categoryRepo.deleteAllInBatch(entities);
  }

  @Override
  public void deleteAllByIdInBatch(Iterable<Long> longs) {
    categoryRepo.deleteAllByIdInBatch(longs);
  }

  @Override
  public void deleteAllInBatch() {
    categoryRepo.deleteAllInBatch();
  }

  @Override
  public Category getReferenceById(Long aLong) {
    return categoryRepo.getReferenceById(aLong);
  }

  @Override
  public <S extends Category> List<S> saveAll(Iterable<S> entities) {
    return categoryRepo.saveAll(entities);
  }

  @Override
  public List<Category> findAll() {
    return categoryRepo.findAll();
  }

  @Override
  public List<Category> findAllById(Iterable<Long> longs) {
    return categoryRepo.findAllById(longs);
  }

  @Override
  public <S extends Category> S save(S entity) {
    return categoryRepo.save(entity);
  }

  @Override
  public Optional<Category> findById(Long aLong) {
    return categoryRepo.findById(aLong);
  }

  @Override
  public boolean existsById(Long aLong) {
    return categoryRepo.existsById(aLong);
  }

  @Override
  public long count() {
    return categoryRepo.count();
  }

  @Override
  public void deleteById(Long aLong) {
    categoryRepo.deleteById(aLong);
  }

  @Override
  public void delete(Category entity) {
    categoryRepo.delete(entity);
  }

  @Override
  public void deleteAllById(Iterable<? extends Long> longs) {
    categoryRepo.deleteAllById(longs);
  }

  @Override
  public void deleteAll(Iterable<? extends Category> entities) {
    categoryRepo.deleteAll(entities);
  }

  @Override
  public void deleteAll() {
    categoryRepo.deleteAll();
  }

  @Override
  public List<Category> findAll(Sort sort) {
    return categoryRepo.findAll(sort);
  }

  @Override
  public Page<Category> findAll(Pageable pageable) {
    return categoryRepo.findAll(pageable);
  }
}
