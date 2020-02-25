package adventOfCodeDay2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Present {

	private int large;
	private int wide;
	private int height;
	
	public Present(int large, int wide, int height) {
		super();
		this.large = large;
		this.wide = wide;
		this.height = height;
	}
	public int getLarge() {
		return large;
	}
	public void setLarge(int large) {
		this.large = large;
	}
	public int getWide() {
		return wide;
	}
	public void setWide(int wide) {
		this.wide = wide;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getAreaOfSmallerSide() {
		List<Integer> areasBySyde = new ArrayList<Integer>();
		areasBySyde.add(getLWArea());
		areasBySyde.add(getLHArea());
		areasBySyde.add(getWHArea());
		
		Integer areaOfSmallerSide=Collections.min(areasBySyde);
		
		return areaOfSmallerSide;
	}
	
	public int getTotalArea() {
		int totalArea=0;
		totalArea=2*(getLWArea() + getLHArea() + getWHArea()) ;
		return totalArea;
	}
	
	public int getTotalPaperNeded() {
		int totalPaper=0;
		totalPaper=getTotalArea()+getAreaOfSmallerSide();	
		return totalPaper;
	}
	
	public int getLWArea() {
		return this.getLarge()*this.getWide();
	}
	public int getLHArea() {
		return  this.getLarge()*this.getHeight();
	}
	public int getWHArea() {
		return this.getWide()*this.getHeight();
	}
	
	public TreeMap<Integer,String> OderSydesByArea() {
		TreeMap<Integer, String> treemap =new TreeMap<Integer,String>();
		treemap.put(getLWArea(),"LW");
		treemap.put(getLHArea(),"LH");
		treemap.put(getWHArea(),"WH");	
		return treemap;
		
	}
	public int ribbonNeeded() {
		int perimeter=0;
		TreeMap<Integer, String> treemap =OderSydesByArea();
		String sideCode=treemap.firstEntry().getValue();
		
		switch(sideCode) {
		
		case "LW":
			perimeter=2*(this.getLarge()+this.getWide());
			break;
		case "LH":
			perimeter=2*(this.getLarge()+this.getHeight());
			break;
		case "WH":
			perimeter=2*(this.getWide()+this.getHeight());	
			break;
		}
		
		perimeter+=this.getLarge()*this.getWide()*this.getHeight();
		return perimeter;
		
	}
	
	
	
	
}
