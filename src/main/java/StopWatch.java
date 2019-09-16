import java.lang.reflect.Array;
import java.util.Random;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public void setEndTime(long endTime){
        this.endTime = endTime;
    }

    public StopWatch(){
    }

    public void start(){
        this.setStartTime(System.currentTimeMillis());
    }

    public void stop(){
        this.setEndTime(System.currentTimeMillis());
    }

    public long getElapsedTime(){
        long elapsedTime = this.getEndTime() - this.getStartTime();
        return elapsedTime;
    }
}
class TimeOfSelectionSort{
    public static void main(String[] args) {
        int[] array = new int[100000];
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        randomArray(array);
        sortArray(array);
        stopWatch.stop();
        System.out.println("\nTime to solve: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void randomArray(int[] array){
        for (int i=0;i< array.length;i++){
            array[i] = (int) Math.random()*100;
        }
    }

    public static void sortArray(int[] array){
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
        }
    }
}