package task.out;
import java.io.*;
import java.util.*;
public class DemoHotel 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  Date date=new Date();
	  System.out.println("Enter Customer Name");
	  String name=sc.nextLine();
	  System.out.println(" ");
	  System.out.println("Hotel Name\t\t\t\t"+"User Name\t\t\t"+"Date and Time");
	  System.out.println(" ");
	  System.out.println("Family Hotel"+"\t\t\t\t"+name+"\t\t\t"+date.toString());
	  int a,b,c,d,e,f,l,i;
	  int eachcost=0;
	  int cost=0;
	  int price=0;
	  int y=0, v=0;
	  String item=" ";
	  System.out.println(" ");
	  System.out.println("Our Menu Card");
	  System.out.println(" ");
	  System.out.println("Item Name\t\t"+"Price\t\t"+"press to order");
	  System.out.println(" ");
	  System.out.println("Rice and Dal\t\t"+"60\t\t"+"1");
	  System.out.println("Ussal and Pav\t\t"+"40\t\t"+"2");
	  System.out.println("Pav and Bhaji\t\t"+"50\t\t"+"3");
	  System.out.println("Misal and Pav\t\t"+"50\t\t"+"4");
	  System.out.println("Veg Biryani\t\t"+"70\t\t"+"5");
	  System.out.println(" ");
	  System.out.println(" ");
	  //how many orders you want to add
	  
	  ArrayList order= new ArrayList();
	  ArrayList<Integer> pric=new ArrayList<>();
	  ArrayList plate=new ArrayList();
	  int press[];
	  do
	  {
	   System.out.println("press corresponding number on menu card to order");
	   a=sc.nextInt();
	   int press1[]=new int[] {a};
	   System.out.println("enter the number of plates");
	   b=sc.nextInt();
	   System.out.println(" ");
	   if(a==1)
	   {
		   item="Rice and Dal";
		   price=60;
		   eachcost=price*b;
		   cost+=eachcost;
		   boolean of=order.contains(item);
		   if(of)
		   {
			   order.add(" ");
			   pric.add(eachcost);
			   plate.add(b);
			   
		   }
		   else
		   {
			   pric.add(eachcost);
			   plate.add(b);
			   order.add(item);
		   }
	   }
	   if(a==2)
	   {
		   item="Usal and Pav";
		   price=40;
		   eachcost=price*b;
		   cost+=eachcost;
		   order.add(item);
		   pric.add(eachcost);
		   plate.add(b);
	   }
	   if(a==3)
	   {
		   item="pav and bhaji";
		   price=50;
		   eachcost=price*b;
		   cost+=eachcost;
		   System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
		   order.add(item);
		   pric.add(eachcost);
		   plate.add(b);
	   }
	if(a==4)
	{
		item="misal and pav";
		price=50;
		eachcost=price*b;
		cost+=eachcost;
		order.add(item);
		pric.add(eachcost);
		plate.add(b);
	}
	if(a==5)
	{
		item="veg biryani";
		price=70;
		eachcost=price*b;
		cost+=eachcost;
		order.add(item);
		pric.add(eachcost);
		plate.add(b);
	}
	for(int k=0;k<press1.length;k++)
	{
		String fetchitemname=" ";
		if(press1[k]==1)
		{
			fetchitemname="rice and dal";
			
		}
		if(press1[k]==2)
		{
			fetchitemname="usal and pav";
		}
		if(press1[k]==3)
		{
			fetchitemname="pav and bhaji";
			
		}
		if(press1[k]==4)
		{
			fetchitemname="misal and pav";
		}
		if(press1[k]==5)
		{
			fetchitemname="veg biryani";
			
		}
	}
	System.out.println("do you want to continue the order(press 1 for continue/otherwise press 0 )");
	y=sc.nextInt();
	System.out.println(" ");
	  }
	  while(y!=0);
	  System.out.println(" ");
	  System.out.println(" ");
	  System.out.println("items names"+"\t\t\t\t\t\t"+"number of plates"+"\t\t"+"sub total");
	  Iterator itr =order.iterator();
	  Iterator<Integer> itr1 =pric.iterator();
	  Iterator itr2 =plate.iterator();
	  while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
	  {
		  System.out.println(itr.next()+"\t\t\t\t\t\t\t\t"+itr2.next()+"\t\t"+"\t\t"+itr1.next());
		  System.out.println(" ");
	  }
	  System.out.println("  ");
	  System.out.println("total bill :"+"\t\t\t\t\t\t\t"+"    "+"\t\t"+cost);
	  System.out.println(" ");
	  System.out.println("do you want to delete the order(press 1 for continue/otherwise press 0)");
	  l=sc.nextInt();
	  System.out.println("");
	  if(l==1)
	  {
		  do
		  {
			  if(order.isEmpty())
			  {
				  System.out.println("your cart is empty");
				  break;
			  }
			  else
			  {
				  System.out.println("press corresponding number to delete");
				  f=sc.nextInt();
				  int delete[]=new int[]{f};
				  if(f==1)
				  {
					  item="Rice and Dal";
					  boolean of=order.contains(item);
					  int of1=order.indexOf(item);
					  if(of)
					  {
						  order.remove(item);
						  cost=cost-pric.remove(of1);
						  plate.remove(of1);
					  }
					  }
					  if(f==2)
					  {
						  item="usal and pav";
						  boolean of=order.contains(item);
						  int of1=order.indexOf(item);
					  if(of)
					  {
						  order.remove(item);
						  cost=cost-pric.remove(of1);
						  plate.remove(of1); 
					  }
				  }
				  if(f==3)
				  {
					  item="pav and bhaji";
					  boolean of=order.contains(item);
					  int of1=order.indexOf(item);
					  if(of) 
					  {
						  order.remove(item);
						  cost=cost-pric.remove(of1);
						  plate.remove(of1);  
					  }
							  
				  }
				  if(f==4)
				  {
					  item="misal and pav";
					  boolean of=order.contains(item);
					  int of1=order.indexOf(item);
					  if(of) 
					  {
						  order.remove(item);
						  cost=cost-pric.remove(of1);
						  plate.remove(of1);  
				  }
			  
		  }
				  if(f==5)
				  {
					  item="veg biryani";
					  boolean of=order.contains(item);
					  int of1=order.indexOf(item);
					  if(of) 
					  {
						  order.remove(item);
						  cost=cost-pric.remove(of1);
						  plate.remove(of1); 
				      }
					  
	              }
				  System.out.println("continue to delete the order(press 1 for continue/otherwise press 0)");
				  v=sc.nextInt();
		  }
		  }
		  while(v!=0);
		  System.out.println(" ");
		  System.out.println("items names"+"\t\t\t\t"+"number of plates"+"\t\t"+"sub total");
		  itr =order.iterator();
		  itr1 =pric.iterator();
		  itr2 =plate.iterator();
		  int scost=0;
		  while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
		  {
			  System.out.println(itr.next()+"\t\t\t\t\t\t"+itr2.next()+"\t\t"+itr1.next());
			  System.out.println(" ");
			  System.out.println(" ");
		  }
		  System.out.println("total bill :"+"\t\t\t\t\t\t\t"+"     "+"\t\t"+cost);
		  }
	  else
		  {
			  System.out.println("items names"+"\t\t\t\t\t\t"+"number of plates"+"\t\t"+"sub total");
			  itr =order.iterator();
			  itr1 =pric.iterator();
			  itr2 =plate.iterator();
			  int scost1=0;
			  while(itr.hasNext() && itr1.hasNext() && itr2.hasNext());
			  {
				  System.out.println(itr.next()+"\t\t\t\t\t\t"+itr2.next()+"\t\t"+itr1.next());
				  System.out.println(" ");
			  }
			  System.out.println("total bill :"+"\t\t\t\t\t\t\t"+"     "+"\t\t"+cost);
		  }
				  System.out.println("Thank You for visiting our Hotel\nName: "+" "+name+"\t\t\t\t\t"+"signature");
	  } 
	  
}

	