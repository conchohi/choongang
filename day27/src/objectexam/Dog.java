package objectexam;


public class Dog {
	
	String name;
	
	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Dog) {
			Dog other = (Dog)obj;
			return other.name.equals(name);
		}
		return false;
	}


}
