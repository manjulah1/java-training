package com.cognologix.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderController {

	public Object readFileInputType() {
		File file = new File(
				"/home/manjula/eclipse-workspace/Collection_Question_10/src/com/cognologix/model/inputData.txt");
		try(FileReader fr = new FileReader(file)) {
		Object dataType = null;
		BufferedReader bufferReader = new BufferedReader(fr);
		String str = null;
		str = bufferReader.readLine();
		if (str.matches("\\d+")) {
			dataType = 0;
		} else if (str.matches("\\d*[.]\\d+")) {
			dataType = 0.0;
		} else {
			dataType = "String";
		}
		return dataType;
		} catch(NullPointerException nullPointerException) {
			throw new RuntimeException(nullPointerException);
		} catch (FileNotFoundException fileNotFoundException) {
			throw new RuntimeException(fileNotFoundException);
		} catch (IOException ioException) {
			throw new RuntimeException(ioException);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public DoublyLinkedListEx<? extends Object> readFileInputData() throws Exception {
		DoublyLinkedListEx<? extends Object> dll = new DoublyLinkedListEx<>();

		FileReaderController frc = new FileReaderController();

		Object dataType = frc.readFileInputType();
		if (dataType.equals("Integer")) {
			dll = new DoublyLinkedListEx<Integer>();
		} else if (dataType.equals("Double")) {
			dll = new DoublyLinkedListEx<Double>();
		} else {
			dll = new DoublyLinkedListEx<String>();
		}
		
		return dll;
	}
}
