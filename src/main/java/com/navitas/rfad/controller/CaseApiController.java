package com.navitas.rfad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.navitas.rfad.model.CaseApiModel;
import com.navitas.rfad.repository.CaseApiRepository;

import java.util.List;


@RestController
public class CaseApiController {

    private final CaseApiRepository caseApiRepository;

    @Autowired
    public CaseApiController(CaseApiRepository caseApiRepository) {
        this.caseApiRepository = caseApiRepository;
    }

    @PostMapping(value = "/caseapi")
    public ResponseEntity<CaseApiModel> create(@RequestBody CaseApiModel caseApiModel) {
        return new ResponseEntity<>(caseApiRepository.save(caseApiModel), HttpStatus.CREATED);
    }

    @GetMapping(value = "/caseapi/{caseId}")
    public ResponseEntity<CaseApiModel> findById(@PathVariable Integer caseId) {
        return new ResponseEntity<CaseApiModel>(HttpStatus.OK);
    }

    @GetMapping(value = "/caseapi")
    public ResponseEntity<List<CaseApiModel>> findAll() {
        return new ResponseEntity<>((List<CaseApiModel>) caseApiRepository.findAll(), HttpStatus.OK);
    }

    @PutMapping(value = "/caseapi/{caseId}")
    public ResponseEntity<CaseApiModel> update(@PathVariable Integer caseId, @RequestBody CaseApiModel caseApiModel) {
        caseApiModel.setCaseId(caseId);
        return new ResponseEntity<>(caseApiRepository.save(caseApiModel), HttpStatus.OK);
    }

    @DeleteMapping(value = "/caseapi/{caseId}")
    public HttpStatus delete(@PathVariable Integer caseId) {
        caseApiRepository.deleteById(caseId);
        return HttpStatus.OK;
    }

}
