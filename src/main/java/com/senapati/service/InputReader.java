package com.senapati.service;

import com.opencsv.bean.CsvToBeanBuilder;
import com.senapati.model.InputModel;
import com.senapati.util.ApplicationConstants;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class InputReader {

    public List<InputModel> readFile() throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("input.csv").getFile());

        FileReader fileReader = new FileReader(file.getAbsolutePath());

        List<InputModel> inputItems = new CsvToBeanBuilder<InputModel>(fileReader)
                .withType(InputModel.class)
                .withSeparator(ApplicationConstants.PIPE_SEPARATOR)
                .build()
                .parse();

        fileReader.close();

        return inputItems;
    }
}
