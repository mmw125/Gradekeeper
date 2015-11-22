package gradingSystems;

import java.util.ArrayList;

import data.Folder;
import data.Gradeable;

public class EqualWeighting implements GradingSystem {
	public static final String IDENTITY = "Equal";
	
	public double grade(Folder folder){
		ArrayList<Gradeable> grades = folder.getGrades();
		if(grades.size() == 0){
			return 0;
		}
		double grade = 0;
		for (Gradeable g : grades){
			grade += g.getGrade()/grades.size();
		}
		return grade;
	}
}
