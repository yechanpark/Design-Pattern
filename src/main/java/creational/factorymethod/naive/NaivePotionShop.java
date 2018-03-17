package creational.factorymethod.naive;

public class NaivePotionShop {

    public RedPotion getRedPotion(){
        return new RedPotion();
    }
}
