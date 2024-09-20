//enum para saber marcar si tienen o no ruedas
public enum sillas  {
    RUEDAS("ruedas"),
        SINRUEDAS("sinruedas");
    private final String ruedas;




   sillas(String ruedas) {
        this.ruedas = ruedas;

    }

    public String getRuedas() {
        return ruedas;
    }
}

