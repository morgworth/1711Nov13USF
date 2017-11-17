package com.revature.designpatterns;

public class ToolFactory {
<<<<<<< HEAD
public Tool workWithTool(String toolType) {
	switch(toolType.toLowerCase()) {
	case "hammer" : return new Hammer();
	case "wrench" : return new Wrench();
	default : return null;
	}

}	
=======
	
	public Tool workWithTool(String toolType){
		switch(toolType.toLowerCase()){
		case "hammer": return new Hammer();
		case "wrench": return new Wrench();
		default: return null;
		}
	}
>>>>>>> master
}
