package OneHundredFowl;

public class FowlLoop extends FowlAbstract{
    int yuan = 100;

    @Override
    public int getMaxCock() {
        return yuan / 5;
    }

    @Override
    public int getMaxHen() {
        return yuan / 3;
    }

    @Override
    public void getResult(){
        for(int cock = 0; cock <= getMaxCock(); cock++){
            for(int hen = 0; hen <= getMaxHen(); hen++){
                for(int chick=0; chick <= 100; chick++) {
                    if ((5 * cock + 3 * hen + (chick / 3.0) == yuan) && (cock + hen + chick == yuan)) {
                        System.out.println("Cock = " + cock + ", Hen = " + hen +", Chicks = " + chick);
                    }
                }
            }
        }
    }
}
