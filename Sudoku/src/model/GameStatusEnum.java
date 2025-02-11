package model;

public enum GameStatusEnum {
    NON_STARTED("não iniciado"),
    IN_PROGRESS("em andamento"),
    COMPLETE("completo");

    private String label;

    GameStatusEnum(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
