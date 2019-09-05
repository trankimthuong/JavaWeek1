package stopwatch;

public class main {
    public static void main(String[] args) {
        double[] a = new double[10000];
        for(int i = 0; i < a.length; i++){
            a[i] = Math.random() * 10000;
        }
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        stopwatch.getStartTime();
        selectionSort(a);
        stopwatch.stop();
        stopwatch.getEndTime();
        System.out.println("");
        System.out.println("time execute id: " + stopwatch.getElapsedTime());
    }

    public static void selectionSort(double a[]){
        for(int i = 0; i < a.length -1; i++){
            double min_idx = a[i];
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    double temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
