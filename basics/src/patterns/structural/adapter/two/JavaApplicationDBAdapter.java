package patterns.structural.adapter.two;

public class JavaApplicationDBAdapter extends JavaApplication implements DataBase {

	@Override
	public void insert() {
		savePeople(new Kate());
		
//		savePeople(new People () {
//
//			@Override
//			public void doJob() {
//				System.out.println("Totally lost...");
//				
//			}});
		
	}

	@Override
	public void read() {
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
