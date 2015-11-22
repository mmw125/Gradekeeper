package gradekeeper;

import gradingSystems.EqualWeighting;
import data.*;

public class Gradekeeper {

	public static void main(String[] args) {
		Folder f = new Folder("Folder");
		f.setGradingSystem(new EqualWeighting());
		Folder quizzes = new Folder("Quizzes");
		f.addItem(quizzes);
		quizzes.addItem(new Assignment("Quiz 1", 8, 10));
		quizzes.addItem(new Assignment("Quiz 2", 9, 10));
		f.addItem(new Assignment("Test 1", 45, 50));
		f.addItem(new Assignment("Test 2", 100, 100));
		System.out.println(f.getGrade());
	}
}
