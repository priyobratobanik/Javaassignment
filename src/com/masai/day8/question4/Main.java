package com.masai.day8.question4;

public class Main {
	public static void main(String[] args){
		Animal animal[] = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Tiger();
		for(Animal a : animal)
		{
			a.eat();
			a.walk();
			a.makeNoise();
		}
	}
}
