public class Joguinho {

    private int boot;
    private int pessoa;

    public Joguinho() {}


    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public int getBoot() {
        return boot;
    }

    public void setBoot() {
        boot = randInt(0, 2);
    }
    public static int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void jogar() {
        setBoot();
        if (boot == pessoa) {
            System.out.println("Boot: " + rodada(getBoot()) + "\nVocê: " + rodada(getPessoa()) + "\nOps empatou ai hein!!");
        } else {
            if ((boot == 0 && pessoa == 2) || (boot == 1 && pessoa == 0) || (boot == 2 && pessoa == 1)) {
                System.out.println("Boot: " + rodada(getBoot()) + "\nVocê: " + rodada(getPessoa()) + "\nO Boot foi o Campeão!!!");
            } else {
                System.out.println("Boot: " + rodada(getBoot()) + "\nVocê: " + rodada(getPessoa()) + "\nVocê foi o campeão!!!");
            }
        }

    }

    public String rodada(int op) {
        switch (op) {
            case 0:
                return "Pedra ";
            case 1:
                return "Papel ";
            case 2:
                return "Pesoura ";
            default:

        }
        return null;
    }
}
