package com.ajay;
 class triangle {
	double width;
	double height;
	double depth;
 
 
	
	 
		 

	public static void main(String[] args) {
	
		triangle tri=new triangle();
		double vol;
		tri.depth=10.00;
		tri.height=10.00;
		tri.width=10.00;
		
vol=tri.depth*tri.width*tri.height;
System.out.println("volume"+vol);
	}
	
		 

}