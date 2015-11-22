package gradingSystems;

import java.util.ArrayList;

import data.Folder;
import data.Gradeable;

public class WeightedSystem implements GradingSystem {
	public final static String IDENTITY = "Weighted";
	@Override
	public double grade(Folder folder) {
		ArrayList<Gradeable> grades = folder.getGrades();
		if(grades.size() == 0){
			return 0;
		}
		double grade = 0;
		for (Gradeable item : grades){
			grade = item.getGrade() * item.getWeight();
		}
		return grade;
	}
	
}
