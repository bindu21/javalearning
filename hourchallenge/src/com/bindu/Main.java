package com.bindu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String ttime = getDurationString(200,45);
        System.out.println(ttime);
        ttime = getDurationString(400);
        System.out.println(ttime);
    }
    public static String getDurationString(int min,int sec){
        if((min < 0) || ((sec<0)||(sec > 59)))
            return "Invalid Value";
        else{
            int newhr=0,newmin = 0,newsec=0;
            newmin = min + sec/60;
            newsec = sec%60;
            newhr = newmin/60;
            newmin=newmin%60;

            return(newhr+"h"+newmin+"m"+newsec+"s");
        }
    }
    public static String getDurationString(int sec){
        if(sec<0)
            return "Invalid Value";
        else {
            int newmin = 0,newsec = 0;
            newmin = sec/60;
            newsec = sec%60;
            return(getDurationString(newmin,newsec));
        }
    }
}
