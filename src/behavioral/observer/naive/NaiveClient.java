package behavioral.observer.naive;

public class NaiveClient {
    public static void main(String args[]) {
        MinMaxChart minMaxChart = new MinMaxChart();
        NumberDataBase numberDataBase = new NumberDataBase(minMaxChart);

        minMaxChart.setNumberDataBase(numberDataBase);

        numberDataBase.insertNumber(3);
        System.out.println();
        numberDataBase.insertNumber(2);
        System.out.println();
        numberDataBase.insertNumber(4);
        System.out.println();
        numberDataBase.insertNumber(1);
        System.out.println();
        numberDataBase.insertNumber(10);
    }
}
