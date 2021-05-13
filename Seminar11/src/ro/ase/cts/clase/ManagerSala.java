package ro.ase.cts.clase;

public class ManagerSala extends Subiect {
    private String tipMeci;

    public String getTipMeci() {
        return tipMeci;
    }

    public void setTipMeci(String tipMeci) {
        this.tipMeci = tipMeci;
    }

    public void anuntaMeci(){
        super.notificaClienti("a aparut un nou meci de " + tipMeci);
    }

}
