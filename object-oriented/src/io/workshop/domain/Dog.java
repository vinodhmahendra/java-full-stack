package io.workshop.domain;

public class Dog {
	
	// syntax declaring attributes
	// <modifier>* type name [ = <initial_value>];
	private int weight;
	
	//syntax declaring methods
	// <modifier>* <return-type> name( <argument> *) {
	// <statement> *
	// }
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int newWeight) {
		if ( newWeight > 0 ) {
			weight = newWeight;
		}
	}
}
