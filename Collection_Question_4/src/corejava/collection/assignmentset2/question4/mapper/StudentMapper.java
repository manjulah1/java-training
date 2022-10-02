package corejava.collection.assignmentset2.question4.mapper;

import corejava.collection.assignmentset2.question4.model.Student;

public class StudentMapper {
	public static Student mapStudentData(String data) {
		String[] arrData = data.split(",");
		try {
		Integer studentId = Integer.parseInt(arrData[0]);
		String studentSubject = arrData[1];
		Integer studentMarks = Integer.parseInt(arrData[2]);

		Student student = new Student(studentId, studentSubject, studentMarks);
		return student;
		} catch(NumberFormatException numberFormatException) {
			throw new RuntimeException(numberFormatException);
		} catch(Exception exception) {
			throw new RuntimeException(exception);
		}
	}
}
