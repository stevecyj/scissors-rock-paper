package abstractclass;

public enum Decision {
    PAPER("布"), SCISSORS("剪刀"), STONE("石頭");

    private String name;

    Decision(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
