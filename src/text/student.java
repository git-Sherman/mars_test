package text;

public class student extends person{
    int grade;
    void create_s(){
    	super.creat_s();
    	System.out.println("再创造一个student");
    	introduce();
    }
    void eat()
    {
    	System.out.println("复写父类的抽象函数");
    	
//    }
//	void jieshao()
//	{
//		super.introduce();
//		System.out.println("wo de nian ji shi "+grade);
	}

	

}
