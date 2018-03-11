package creational.factorymethod.naive;

public class NaiveClient {
    public static void main(String args[]) {

        NaiveUser naiveUser = new NaiveUser();
        NaivePotionShop naivePotionShop = new NaivePotionShop();

        naiveUser.setRedPotion(naivePotionShop.getRedPotion());
        naiveUser.drink();
        naiveUser.drink();

    }
}
