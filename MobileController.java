package xyz;
import java.util.*;

import object.Emp;
public class MobileController {

	public static void main(String[] args) throws MobileDuplicateException {
		Scanner scn=new Scanner(System.in);
		System.out.println("                                       Swagat Hai Aapka !!                                               ");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Enter the quantity of the Product");
		int n=scn.nextInt();
		Mobile []mob=new Mobile[n];
	/*	mob[0]=new Mobile("Doogee","V Max",6.58,22000,52500);
		mob[1]=new Mobile("Samsung ","Galaxy M34 256GB",6.5,6000,20999);
		mob[2]=new Mobile("Apple","15 Pro Max 256GB",6.7,4422,159900);
		mob[3]=new Mobile("Apple ","14 128GB white",6.1,3279,56999);
		mob[4]=new Mobile("Apple ","14 128GB blue",6.1,3279,56999);
	 	mob[5]=new Mobile("Samsung ","Galaxy M34 256GB",6.5,6000,20999);
         */ 
		for(int i=0;i<mob.length;i++) {
			System.out.println("Enter the Details of Mobile No : "+(i+1));
			System.out.println("Brand :"); scn.nextLine();
			String brand=scn.nextLine();
			System.out.println("Model :");
			String model=scn.nextLine();
			System.out.println("Screen Size :");
			double screenSize=scn.nextDouble();
			System.out.println("BatteryCapacity  :");
			int battery=scn.nextInt(); 
			System.out.println("Price :");
			double price=scn.nextDouble(); scn.nextLine();
			
			mob[i]=new Mobile(brand,model,screenSize,battery,price);
		} 
		int choice;
		do {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("press 1 for display the Lowest Price Product");
			System.out.println("press 2 for Select The Product");
			System.out.println("press 3 for Same Price Product");
			System.out.println("press 4 for Check Duplicate Product are Listed or Not");
			System.out.println("--------------------------------------------------------------------------");

			System.out.println("Enter the choice :");
			 choice=scn.nextInt();
			switch(choice) {
			case 1:
				Mobile.lowestPrice(mob);			      
			break;
			
			case 2:
				for(int i=0;i<mob.length;i++) {
					System.out.println("Press "+(i)+" for ");
					System.out.println(mob[i]);
				}
				int c=scn.nextInt();
				if(c>=0 && c<mob.length) {
				double d=	mob[c].getPrice();
				mob[c].discount(d);
//				if(	mob[c].getPrice()>30000) {
//					Mobile.discount(mob[c].getPrice());
//				}
//				else {
//					System.out.println("No Discount");
//				}
				}	
			break;
			
			case 3:
				Mobile.samePrice(mob);
			break;
		   case 4:
			   try {
			        Mobile.duplicate(mob);
			    } catch (MobileDuplicateException e) {
			        System.out.println("Error: " + e.getMessage());
			    }
			   
			break;
			default:
				System.out.println("invalid input");
			}					
		}while(choice<=4 && choice >0);{
			System.out.println("exit");
		}
		scn.close();		
	}

}
