package com.javalive.conceptBased;

/**
 * @author JavaLive.com description Perhaps in your daily Java coding, you see
 *         (and use) upcasting(narrowing) and downcasting(widning) occasionally.
 *         You may hear the terms ‘casting’, ‘upcasting’, ‘downcasting’ from
 *         someone or somewhere, and you may be confused about them. As you read
 *         on, you will realize that upcasting and downcasting are really
 *         simple.
 * 
 *         Before we go into the details, suppose that we have the following
 *         class hierarchy: Mammal > Animal > Dog, Cat
 * 
 *         Mammal is the super interface:
 */

interface Mammal {
	public void eat();

	public void move();

	public void sleep();
}

abstract class Animal implements Mammal {
	public void eat() {
		System.out.println("Eating...");
	}

	public void move() {
		System.out.println("Moving...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}

}

class Dog extends Animal {
	public void bark() {
		System.out.println("Gow gow!");
	}

	public void eat() {
		System.out.println("Dog is eating...");
	}
}

class Cat extends Animal {
	public void meow() {
		System.out.println("Meow Meow!");
	}
}

class AnimalTrainer {
	public void teach(Animal anim) {
		anim.move();
		anim.eat();
		// if there's a dog, tell it barks
		if (anim instanceof Dog) {
			Dog dog = (Dog) anim;
			dog.bark();
		}
	}
}

public class TypeCastingofObjectsDemo {
	public static void main(String[] args) {

		// ============UPCASTING==============//
		/*
		 * Upcasting is casting a subtype to a supertype, upward to the inheritance
		 * tree. Let’s see an example:
		 */
		Dog dog = new Dog();
		Animal anim = (Animal) dog;
		anim.eat();
		// Some more examples of upcasting are:
		Mammal mam = new Cat();
		Animal anim1 = new Dog();

		/*
		 * Why is Upcasting in Java? Generally, upcasting is not necessary. However, we
		 * need upcasting when we want to write general code that deals with only the
		 * supertype. Consider the following class: The teach() method of AnimalTrainer
		 * class can accept any object which is subtype of Animal. So objects of type
		 * Dog and Cat will be upcasted to Animal when they are passed into this method:
		 */
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();

		AnimalTrainer trainer = new AnimalTrainer();
		trainer.teach(dog1);
		trainer.teach(cat1);

		// ============DOWNCASTING==============//
		/*
		 * Downcasting is casting to a subtype, downward to the inheritance tree. Let’s
		 * see an example:
		 */
		Animal animal = new Cat();
		Cat cat = (Cat) animal;
		/*
		 * Here, we cast the Animal type to the Cat type. As Cat is subclass of Animal,
		 * this casting is called downcasting. Unlike upcasting, downcasting can fail if
		 * the actual object type is not the target object type. For example:
		 */
		Animal animal1 = new Cat();
		Dog dog11 = (Dog) animal1;

		/*
		 * This will throw a ClassCastException because the actual object type is Cat.
		 * And a Cat is not a Dog so we cannot cast it to a Dog. The Java language
		 * provides the instanceof keyword to check type of an object before casting.
		 * For example:
		 */
		/*
		 * if (anim instanceof Cat) { 
		 * Cat cat11 = (Cat) anim; 
		 * cat11.meow(); 
		 * } else if
		 * (anim instanceof Dog) { 
		 * Dog dog111 = (Dog) anim; 
		 * dog111.bark(); }
		 */
		/*
		 * So if you are not sure about the original object type, use the instanceof
		 * operator to check the type before casting. This eliminates the risk of a
		 * ClassCastException thrown.
		 */

		/*
		 * Why is Downcasting in Java? 
		 * Downcasting is used more frequently than upcasting. 
		 * Use downcasting when we want to access specific behaviors of a
		 * subtype. Consider AnimalTrainer class defined above:
		 * Here, in the teach() method, we check if there is an instance of a Dog object
		 * passed in, downcast it to the Dog type and invoke its specific method,
		 * bark(). Okay, so far you have got the nuts and bolts of upcasting and
		 * downcasting in Java. 
		 * Remember: Casting does not change the actual object type(on RHS). 
		 * Only the reference type gets changed(On LHS). 
		 * Upcasting is always safe and never fails.
		 * Downcasting can risk throwing a ClassCastException, so the
		 * instanceof operator is used to check type before casting.
		 */

	}
}
