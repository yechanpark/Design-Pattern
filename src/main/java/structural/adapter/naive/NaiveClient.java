package structural.adapter.naive;

public class NaiveClient {
    public static void main(String args[]) {
        DomesticTV domesticTV = new DomesticTV();
        DomesticTVConsent domesticTVConsent = new DomesticTVConsent();
        OverseasTVConsent overseasTVConsent = new OverseasTVConsent();

        domesticTV.on( domesticTVConsent.getDomesticVoltage() );
        domesticTV.on( overseasTVConsent.getOverseasVoltage() );
    }
}
