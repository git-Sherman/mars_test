package zhuangshizhe;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//我们要生成一个A公司的水管工人
		//首先生成一个水管工对象
		Plumber plumber=new Plumber();
		Carpenter carpenter=new Carpenter();
		//生成一个A公司员工的对象，并将水工工对象做为参数传递进去
		AWork awork=new AWork(plumber);
		awork.dosomework();
		awork=new AWork(carpenter);
		awork.dosomework();
		BWorker bworker=new BWorker(plumber);
		bworker.dosomework();
	}

}
