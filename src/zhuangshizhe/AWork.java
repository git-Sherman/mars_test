package zhuangshizhe;

public class AWork implements Worker{
	private Worker worker;
	public  AWork(Worker worker){
		this.worker=worker;
	}
	public void dosomework(){
		System.out.println("你好 ，我来自A公司");
		worker.dosomework();
		
	}

}
