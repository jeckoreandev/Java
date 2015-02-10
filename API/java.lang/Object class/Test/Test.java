class Test{
	private int x;
	Test(int x){
		this.x = x;
	}
	public boolean equals(Object obj){
		if(this.instanceof(obj)){
			return this.x == t.x;
		}else{
			System.out.println("NOT Instance");
		}
	}

	public static void main(String[] args){
		Test t = new Test(3);
		Integer i = new Integer(3);
		String s = "3";
		StringBuffer sb = new StringBuffer("3");
		Object o = new Integer(3);
		System.out.println(t.equals(new Test(3)));
		System.out.println(t.equals(new Test(i)));
		System.out.println(t.equals(new Test(s)));
		System.out.println(t.equals(new Test(sb)));
		System.out.println(t.equals(new Test(o)));
	}
}