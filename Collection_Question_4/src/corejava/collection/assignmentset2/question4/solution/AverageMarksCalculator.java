package corejava.collection.assignmentset2.question4.solution;

import java.util.List;

import corejava.collection.assignmentset2.question4.model.Student;

public class AverageMarksCalculator {
	private List<Student> studentList;

	public AverageMarksCalculator(List<Student> studentList) {
		this.studentList = studentList;
	}

	// get lowest id from the list of students
	public Integer getLowestIdFromTheListOfStudents() {
		Integer lowestId = studentList.get(0).getStudentId();
		for (Student student : studentList) {
			if (student.getStudentId() < lowestId) {
				lowestId = student.getStudentId();
			}
		}
		return lowestId;
	}

	// get average marks for the student having lowest id
	public Double getAverageMarksForTheStudent(Integer id) {
		Integer sum = 0;
		int count = (int) studentList.stream().filter(student -> student.getStudentId().equals(id)).count();
		sum = studentList.stream().filter(student -> student.getStudentId().equals(id))
				.mapToInt(student -> student.getStudentMarks()).sum();
		return (double) (sum / count);
	}
}
