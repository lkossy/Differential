package differential;

public class Differential_lib implements Differential_if{
  private double a,h;
  public Differential_lib(double a,double h) {
	  this.a=a;
	  this.h=h;
	  
  }
	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		return 2*this.a;
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub
		return (Math.pow(this.a+this.h,2)-Math.pow(this.a,2))/h;
	}
	@Override
	public double getError() {
		// TODO Auto-generated method stub
		double ans,min,min_dif = 0;
		int count=0;
		min=(Math.abs(2*this.a-(Math.pow(this.a+1,2)-Math.pow(this.a,2))/1)/(2*this.a))*100;
	for(double i = 1;i >0 ;i-=0.0000000001) {
		  ans=(Math.abs(2*this.a-(Math.pow(this.a+i,2)-Math.pow(this.a,2))/i)/(2*this.a))*100;;
		  if(ans < min) {
			  min=ans;
			  min_dif = i;
			  count+=1;
		  }
		  if(count % 1000000 ==0) {
			  System.out.println("Œ»Ý‚Ì”’l”÷•ª‚Í"+min_dif);
			  System.out.println("Œ»Ý‚Ì‘Š‘ÎŒë·‚Í"+min);
		  }
		}                           
		System.out.println("Å¬‚Ì”’l”÷•ª‚Í"+min_dif);
		System.out.println("Å¬‚Ì‘Š‘ÎŒë·‚Í"+min);   
	    return (Math.abs(2*this.a-(Math.pow(this.a+this.h,2)-Math.pow(this.a,2))/h)/(2*this.a))*100;
	}
  
	
	
}


