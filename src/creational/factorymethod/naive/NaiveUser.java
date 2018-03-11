package creational.factorymethod.naive;

public class NaiveUser {
    private RedPotion redPotion;

    public void setRedPotion(RedPotion redPotion) {
        this.redPotion = redPotion;
    }

    public void drink() {

        if(redPotion==null)
            System.out.println("포션이 부족합니다");
        else
            redPotion.use();

        redPotion = null;
    }
}
