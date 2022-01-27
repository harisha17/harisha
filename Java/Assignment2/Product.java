package com.sonata;

public class Product {
	int pId;
	String pName;
   static double pPrice;
    Product(int id,String name,double price){
    	this.pId=id;
    	this.pName=name;
    	this.pPrice=price;
    }
    public double Totalbill(double GST) {
    	double total=this.pPrice*GST;
    	return total;
    }
    public void display() {
    	System.out.println(pId);
    	System.out.println(pName);
    	System.out.println(pPrice);
    }
    public static void main(String args[]) {
    	Product p1=new Product(12,"laptop",64000);
    	p1.display();
    	double a=p1.Totalbill(0.08);
    	System.out.println("TAX:"+a);
    	double b=a+pPrice;
    	System.out.println("Total:"+b);
    }
    

}

