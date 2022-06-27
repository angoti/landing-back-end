package com.professorangoti.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class GenericController<T> {

    private final CrudRepository<T, Integer> crudRepository;

    public GenericController(CrudRepository<T, Integer> crudRepository) {
        this.crudRepository = crudRepository;
    }

    @GetMapping("")
    public ResponseEntity<List<T>> getPage() {
        List<T> list = new ArrayList<>();
        crudRepository.findAll().forEach(list::add);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getOne(@PathVariable Integer id) {
        Optional<T> one = crudRepository.findById(id);
        if (one.isPresent()) {
            return ResponseEntity.ok(one.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping("")
    public ResponseEntity<T> update(@RequestBody T updated) {
        return ResponseEntity.ok(crudRepository.save(updated));
    }

    @PostMapping("")
    public ResponseEntity<T> create(@RequestBody T created) {
        return ResponseEntity.ok(crudRepository.save(created));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        crudRepository.deleteById(id);
        return ResponseEntity.ok("Recurso excluido.");
    }
}
