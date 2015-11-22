package data;

public class Assignment extends Gradeable{
	private double minPoints;
	private double maxPoints;
	
	public Assignment(String name, double points, double totalPoints){
		this(name);
		setMinPts(points);
		setMaxPts(totalPoints);
	}
	
	public Assignment(String name){
		super(name);
	}
	
	public void setMinPts(double pts){
		minPoints = pts;
	}
	
	public void setMaxPts(double pts){
		maxPoints = pts;
	}
	
	public double getGrade(){
		double grade = minPoints/maxPoints;
		System.out.println(minPoints+"/"+maxPoints+"="+grade);
		return minPoints/maxPoints;
	}

	@Override
	public double getMaxPoints() {
		return maxPoints;
	}

	@Override
	public double getPoints() {
		return minPoints;
	}
	
	public double getPercentage(){
		return minPoints/maxPoints;
	}
	
	@Override
	public String toString(){
		return "{"+getName() + DELIMITER + getPoints() + DELIMITER + getMaxPoints() + DELIMITER + getWeight() + "}";
	}
}
