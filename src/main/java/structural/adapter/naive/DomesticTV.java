package structural.adapter.naive;

public class DomesticTV {
    private final int acceptableVoltage = 220;

    public void on(int electricCurrent) {
        if ( this.isAcceptableVoltage(electricCurrent) )
            System.out.println("Domestic TV is Turned On");
        else
            System.out.println("Warning : Not Acceptable Voltage");
    }

    private boolean isAcceptableVoltage(int supplyVoltage) {
        return this.acceptableVoltage == supplyVoltage;
    }
}
