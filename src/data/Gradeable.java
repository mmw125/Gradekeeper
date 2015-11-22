package data;

import gradingSystems.EqualWeighting;
import gradingSystems.GradingSystem;
import gradingSystems.PointsBasedSystem;
import gradingSystems.WeightedSystem;

public abstract class Gradeable {
	private String name;
	
	//Setting this protects later equations from failing
	private double weight = -1;
	
	protected static final String DELIMITER = "|";
	
	private Gradeable parent;
	public Gradeable(String name){
		this.name = name;
	}
	public void setParent(Gradeable par){
		parent = par;
	}
	public Gradeable getParent(){
		return parent;
	}
	public abstract double getGrade();
	public abstract double getMaxPoints();
	public abstract double getPoints();
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public static GradingSystem getSystemFromID(String ID){
		switch(ID){
		case PointsBasedSystem.IDENTITY:
			return new PointsBasedSystem();
		case EqualWeighting.IDENTITY:
			return new EqualWeighting();
		case WeightedSystem.IDENTITY:
			return new WeightedSystem();
		}
		return null;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isRoot(){
		return parent == null;
	}
}
