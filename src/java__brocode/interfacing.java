package java__brocode;

interface prey{
	void flee();
	
}
interface preadator{
	void hunt();
	
	
}
class rabbit implements prey{

	@Override
	public void flee() {
		System.out.println("*the rabbit is running*");
	}
	
}
class hawk implements preadator{

	@Override
	public void hunt() {
		System.out.println("*hawk is hunting*");
	}
	
} 
class shark implements prey,preadator{

	@Override
	public void hunt() {
		System.out.println("*shark is hunting*");
	}

	@Override
	public void flee() {
		System.out.println("*shark is swimming*");
	}
	
}
public class interfacing {

	public static void main(String[] args) {
		rabbit r = new rabbit();
		hawk h = new hawk();
		shark s = new shark();
		
		r.flee();
		h.hunt();
		s.flee();
		s.hunt();
		
	
	}

}
