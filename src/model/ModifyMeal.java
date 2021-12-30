package model;

public class ModifyMeal {
    private String local;
    private String chinese;
    private String french;

    public ModifyMeal(String local, String chinese, String french) {
        this.setLocal(local);
        this.setChinese(chinese);
        this.setFrench(french);
    }

    public ModifyMeal() {
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getFrench() {
        return french;
    }

    public void setFrench(String french) {
        this.french = french;
    }
}
