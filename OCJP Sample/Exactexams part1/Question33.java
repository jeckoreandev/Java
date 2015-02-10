class SuperCale{
	protected static int multiplay(int a , int b){return a* b ;}
}

class SubCale extends SuperCale {
	public static int multiplay(int a , int b){
		int c = super.multiplay(a,b);
	}
}

