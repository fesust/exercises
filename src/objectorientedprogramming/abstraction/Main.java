package objectorientedprogramming.abstraction;

public class Main {

	public static void main(String args[]){
        //INSTIATING AN ABSTRACT CLASS GIVES COMPILE TIME ERROR
        //Person p =  new Person() ;
        
        
        Person person = new Employee();
        person.setName("Tamas Fesus");
        person.printName();
        Employee em = new Employee();
        em.setName("Gabor Szappanos");
        em.setId(1);
        em.printName();
        System.out.println(em.getId());
        
	}
	
}