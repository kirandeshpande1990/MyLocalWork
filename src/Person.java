import java.util.LinkedHashSet;
import java.util.Set;

public class Person {
	String firstname;
	int id;

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		Person guest = (Person) obj;
		return id == guest.id && (firstname == guest.firstname || (firstname != null && firstname.equals(guest.getFirstname())));

	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + id;
		return result;
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setFirstname("kiran");
		Person person2 = new Person();
		person2.setFirstname("kiran");
		System.out.println(person1 == person2);
		System.out.println(person1.equals(person2));
		System.out.println(person1.hashCode()+" *** "+person2.hashCode());
	}
	
	public static  <T> Set<T> copy(Set<T> source){
        return new LinkedHashSet<T>(source);
 }

	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
