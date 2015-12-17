package zhuangshizhe;

public class BWorker implements Worker{
	private Worker worker;
	public BWorker(Worker worker){
		this.worker=worker;
	}
	public void dosomework(){
		System.out.println("我来自B公司");
		worker.dosomework();
		
	}

}
