class Pizza{
	java.util.ArrayList toppings;

	public final void addTopping(String topping){
		toppings.add(topping);
	}
	public void removeTopping(String topping){
		toppings.remove(topping);
	}
}

class PeperoniPizza extends Pizza{
	public void addTopping(String topping){
		System.out.println("Cannot add Topping");
	}

	public static void main(String[] args){
		Pizza pizza = new PeperoniPizza();
		pizza.addTopping("Mushroms");
		pizza.removeTopping("peperoni");
	}
}