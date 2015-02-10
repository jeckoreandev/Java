class TestZoo extends Zoo{
	public String getName(){
		return this.name;
	}
	public void hoge(){System.out.println("Zoo#hoge()");}
	public static void main(String[] args){
		Zoo zoo = new TestZoo("kirin");
		String name = zoo.getName();
		int count = zoo.getCount();

		System.out.println(name + "  " + count);
	}
}