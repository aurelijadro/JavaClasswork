package patterns.creational.builder.one;

public class JavaStringBuilder {
	
	public static void main(String [] args) {
	
	StringBuilder builder = new StringBuilder();
	
	builder.append("Laura");
	builder.append("a");
	builder.append(12);
	System.out.println(builder);

}
}