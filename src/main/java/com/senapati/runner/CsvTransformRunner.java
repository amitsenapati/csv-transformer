package com.senapati.runner;

import com.senapati.model.InputModel;
import com.senapati.service.InputReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class CsvTransformRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CsvTransformRunner.class);


    @Autowired
    InputReader inputReader;

    @Override
    public void run(String... args) throws Exception {
        List<InputModel> inputItems = inputReader.readFile();
        logger.info("input file read into memory. size of list {}", inputItems.size());
    }
}
