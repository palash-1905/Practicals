public class practicalfact{
  public static void main(String[] args){
    practicalfact obj= new practicalfact();
    int size=Integer.parseInt(args[0]);
    long[] num=new long[size];
    for(int i=0;i<size;i++){
      num[i]=System.nanoTime()%21;      
    }
    long startTime,endTime,timeTaken;
    long totalTime1=0;
    long totalTime2=0;
    
    for(int i=0;i<size;i++){
      startTime=System.nanoTime();
      obj.fact1(num[i]);
      endTime=System.nanoTime();
      timeTaken=endTime-startTime;
      totalTime1 += timeTaken;
    }
    long avgTimeTaken1=totalTime1/size;
    System.out.println(avgTimeTaken1);
    
    for(int i=0;i<size;i++){
      startTime=System.nanoTime();
      obj.fact2(num[i]);
      endTime=System.nanoTime();
      timeTaken=endTime-startTime;
      totalTime2 += timeTaken;
    }
    long avgTimeTaken2=totalTime2/size;
    System.out.println(avgTimeTaken2);
    
    if(avgTimeTaken1 < avgTimeTaken2)
      System.out.println("Number 1 meth is faster");
    else if(avgTimeTaken1==avgTimeTaken2)
      System.out.println("both faster");
    else
      System.out.println("Number 2 meth is faster");
  }
  
  long fact1(long num){
    if(num<0){
      return -1;
    }else if(num<2){
      return 1;
    }else{
      long fact=1;
      for(long i=2;i<=num;i++){
        fact*=i;
      }
      return fact;
    }
  }
  
  long fact2(long num){
    if(num<0){
      return -1;
    }else if(num<2){
      return 1;
    }else{
      return num*fact2(num-1);
    }
  }
}
