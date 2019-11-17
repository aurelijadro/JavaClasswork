package comparator;

public class Developer {
	private int codeLines;

	public Developer(int codeLines) {
		this.codeLines = codeLines;
	}

	public int getCodeLines() {
		return codeLines;
	}

	@Override
	public String toString() {
		return "Developer [codeLines=" + codeLines + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codeLines;
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
		Developer other = (Developer) obj;
		if (codeLines != other.codeLines)
			return false;
		return true;
	}

}
