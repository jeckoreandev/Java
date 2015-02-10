class Super{}
class sub extends Super{}
class subSub extends sub{}

class Test{
	public static void main(String[] argss){
		Super s1 = new Super();
		sub s2 = (sub)s1;
	}
}