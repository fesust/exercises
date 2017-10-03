package objectorientedprogramming.encapsulation;

public class Runner {

	public static void main(String[] args) {
		EncapsulationExample encap = new EncapsulationExample();
		encap.setName("Tamas");
		encap.setAge(20);
		encap.setIdNum("001");
		
		System.out.println("Name: " + encap.getName() + ",age: " + encap.getAge() + ", ID: " + encap.getIdNum());
		
		}
}
