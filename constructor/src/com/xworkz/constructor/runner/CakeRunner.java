package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Cake;

public class CakeRunner {
public static void main(String args[]) {
	Cake cake = new Cake();
	System.out.println("This cake is Varity:"+cake.flavour);
	System.out.println("This cake is Varity:"+cake.price);
	System.out.println("This cake is Varity:"+cake.weigth);
	System.out.println("This cake is Varity:"+cake.shape);
	System.out.println("This cake is Varity:"+cake.types);
	System.out.println("Assinging value after");
	cake.flavour = "BlackForest";
	cake.price = 450;
	cake.weigth=1.2f;
	cake.shape="Round";
	cake.types="Testy";
	System.out.println("This cake is Varity:"+cake.flavour);
	System.out.println("This cake is Varity:"+cake.price);
	System.out.println("This cake is Varity:"+cake.weigth);
	System.out.println("This cake is Varity:"+cake.shape);
	System.out.println("This cake is Varity:"+cake.types);
}
}
