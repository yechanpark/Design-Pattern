package structural.adapter.naive;

public class OverseasTV {
    private final int acceptableVoltage = 110;

    public void on(int electricCurrent) {
        if ( this.isAcceptableVoltage(electricCurrent) )
            System.out.println("Overseas TV is Turned On");
        else
            System.out.println("Warning : Not Acceptable Voltage");
    }

    private boolean isAcceptableVoltage(int supplyVoltage) {
        return this.acceptableVoltage == supplyVoltage;
    }
}
