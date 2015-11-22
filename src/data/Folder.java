package data;

import gradingSystems.GradingSystem;
import gradingSystems.PointsBasedSystem;

import java.util.ArrayList;

public class Folder extends Gradeable {
	private ArrayList<Gradeable> items;
	private GradingSystem system = new PointsBasedSystem();
	
	
	public Folder(String folderName){
		super(folderName);
		items = new ArrayList<Gradeable>();
	}
	
	public ArrayList<Gradeable> getGrades(){
		return items;
	}
	
	public void setGradingSystem(GradingSystem sys){
		if(sys != null){
			system = sys;
		}
	}
	
	public Folder addItem(Gradeable item){
		if(item != null){
			item.setParent(this);
			items.add(item);
		}
		return this;
	}
	
	public void removeItem(Gradeable item){
		items.remove(item);
	}
	
	public double getGrade() {
		try{
			return system.grade(this);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		return 0;
	}
	

	@Override
	public double getMaxPoints() {
		double points = 0;
		for(Gradeable item : items){
			points = points + item.getMaxPoints();
		}
		return points;
	}

	@Override
	public double getPoints() {
		double points = 0;
		for(Gradeable item : items){
			points = points + item.getPoints();
		}
		return points;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("{"+getName());
		builder.append(DELIMITER);
		builder.append("PTS:"+getPoints());
		builder.append(DELIMITER);
		builder.append("OUT:"+getMaxPoints());
		if(getWeight() != -1){
			builder.append(DELIMITER);
			builder.append("WGT:"+getWeight());
		}
		for(Gradeable item : items){
			builder.append(item);
		}
		builder.append("}");
		return builder.toString();
	}
	
	public static Folder stringToFolder(String str){
		str.indexOf("{");
		return null;
	}
}
