public enum PlaneType {

    BOEING747(380),
    BOEING777(400),
    BOEING737(200),
    BOEING787(242),
    BOEING757(290),
    BOEING767(280),
    BOEING727(180),
    AIRBUSA320(220),
    BOEING707(190),
    AIRBUSA380(520);

    private final int value;

    PlaneType(int value) {

        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
