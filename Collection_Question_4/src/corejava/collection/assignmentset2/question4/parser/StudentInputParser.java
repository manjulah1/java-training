package corejava.collection.assignmentset2.question4.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;

public class StudentInputParser {

	public List<Student> parseArray(final String[] inputData) {
		List<Student> list = new ArrayList<>();
		for (String data : inputData) {
			Student student = StudentMapper.mapStudentData(data);
			list.add(student);
		}
		return list;
	}

	public List<Student> parseCSVFile(String filePath) {
		List<Student> list = new ArrayList<>();
		try(FileReader reader = new FileReader(filePath)) {
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {

				Student student = StudentMapper.mapStudentData(line);
				if (student != null) {
					list.add(student);
				}
			}
		} catch (IOException ioException) {
			throw new RuntimeException(ioException);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
		return list;
	}

}
