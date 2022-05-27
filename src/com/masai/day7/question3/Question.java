package com.masai.day7.question3;

public class Question {

	/*
	
		Q3)
		What is the use of ‘this’ and ‘super’ keyword in java explain with example.
		ans: 
			super Keyword :
			----------------
			A reserved keyword used to call the base class method or variable is known as a super keyword. 
			The super keyword is not only used to refer to the base class instance but also static members too.
			class Animal{  
			    // data member of Animal class  
			    String color = "white";    
			} 
				// create child class of Animal  
			class Cat extends Animal{  
			    //default constructor  
			    Cat()  
			    {  
			        // data members of the Cat class  
			        String color = "Brown";    
			        System.out.println("The cat is of color "+super.color); // calling parent class data member  
			        System.out.println("The cat is of color "+color);  
			    }  
            }  
	
			this keyword :
			------------------
			It is a reserved keyword in Java that is used to refer to the current class object. 
			It is a reference variable through which the method is called. 
			Other uses of this keyword are:
				We can use it to refer current class instance variable.
				We can use it to invoke the current class method.
				We can pass it as an argument in the method and constructor calls.
			
			    // initialize instance and static variable   
			    int x = 5;  
			    staticinty = 10;  
			    
			    void printDetails(){
			    	System.out.println(this.x) //to refer current class instance variable.
				{
	 */
}