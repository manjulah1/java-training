package corejava.collection.assignmentset2.question4;

import java.util.List;

import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question4.parser.StudentInputParser;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculator;

public class Main {

	public static void main(String[] args) {
		// parse input array to list of Student
		try {
			StudentInputParser inputParser = new StudentInputParser();
			String filePath = "/home/manjula/eclipse-workspace/JavaTraining/src/corejava/collection/assignmentset2/question4/datafiles/inputFile.csv";
			List<Student> studentList = inputParser.parseCSVFile(filePath);

			AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(studentList);

			// get lowest id from the list of students
			final Integer lowestId = averageMarksCalculator.getLowestIdFromTheListOfStudents();

			// get average marks for the student having lowest id
			final Double average = averageMarksCalculator.getAverageMarksForTheStudent(lowestId);

			// print the results
			System.out.println("Average marks of student with lowest Id " + lowestId + " is: " + average);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
