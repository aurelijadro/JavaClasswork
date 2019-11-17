package queue;

public class People {
	private int id;

	public People(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "People [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
