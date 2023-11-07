package xyz;
class MobileException extends Exception {
    public MobileException(String message) {
        super(message);
    }
}
class MobileDuplicateException extends Exception {
    public MobileDuplicateException(String message) {
        super(message);
    }
}

class Mobile {
	private String brand;
	private String model;
	private double screenSize;
	private int batteryCapacity;
	private double price;
	public Mobile(String brand, String model, double screenSize, int batteryCapacity, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.screenSize = screenSize;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public double getPrice() {
		return price;
	}
	
//	public void displayDetails() {
//		System.out.println("Brand -"+brand+" || "+"Model -"+model+" || "+"ScreenSize -"+screenSize+" || "+"Battery Capacity -"+batteryCapacity+" || "+"Price -"+price);
//	}
	public static void lowestPrice(Mobile [] m) {
		Mobile mob=m[0];
		for(int i=1;i<m.length;i++) {
			if(mob.getPrice() > m[i].getPrice()) {
				mob=m[i];
			}
		}
		System.out.println(mob);
	}
	public static void samePrice(Mobile[] m) {		
	    boolean[] isVisited = new boolean[m.length];	
	    
	    for (int i = 0; i < m.length; i++) {
	        int count = 0;
	        Mobile s=null;
	        if (isVisited[i]==false) {			
	            for (int j = (i + 1); j < m.length; j++) {
	                if (m[i].getPrice() == m[j].getPrice()) {
	                    count++;	
	                    //s=m[j];
	                    isVisited[j] = true;
	                }
	            }
	            if (count > 0) {
	                System.out.println( (count + 1)+" Product are of same price");
	                System.out.println("--------------------------------------------------------------------------");
	                System.out.println(m[i]);
	               // s.displayDetails();
	            }
	        }
	    }
	}
	
	public static void duplicate(Mobile[] m) throws MobileDuplicateException {	
		 boolean[] isVisited = new boolean[m.length];	
		    
		    for (int i = 0; i < m.length; i++) {
		        int count = 0;
		        Mobile s=null;
		        if (!isVisited[i]) {			
		            for (int j = i + 1; j < m.length; j++) {
		                if (m[i].getModel()== m[j].getModel()) {
		                    count++;	
		                    s=m[j];
		                    isVisited[j] = true;
		                }
		            }
		            if (count > 0) {
		                System.out.println( (count + 1)+" Product are of same type");
		                System.out.println("--------------------------------------------------------------------------");
		                System.out.println(m[i]);	                
		                System.out.println(s);
		                throw new MobileDuplicateException("Duplicate products found.");
	             		}
    	            
//		            	 try {
//		     	            throw new MobileDuplicateException("No Duplicates are found");
//		     	        } catch (MobileDuplicateException e) {
//		     	            System.out.println("Error: " + e.getMessage());
//		     	        }
             
			}
		}
        	System.out.println("No !! Duplicates are Found");
	}	
	public static void discount(double d) {		
		if (d > 30000) {
	        d = d * 0.9;
	        System.out.println("Discounted price: " + d);
	    } else {
	        try {
	            throw new MobileException("No discount available for this product.");
	        } catch (MobileException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
		
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", screenSize=" + screenSize + ", batteryCapacity="
				+ batteryCapacity + ", price=" + price + "]";
	}
	
	
}


