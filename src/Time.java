public class Time {


   public int restSeconds(int a , int b){
       int currenttime =  ((a * 60)*60) + (b * 60);
       int endtime= (17 * 60) * 60;
       int resttime = endtime - currenttime;
       return resttime;


}

}
