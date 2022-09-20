public enum Days {
    MONDAY("Duishombu kunu java okuim"),
    TUESDAY("Sheishembi kunu java okuim"),
    WEDNESDAY("Sharshembi kunu soft skill"),
    THURSDAY("Beishembi kunu english okuim"),
    FRIDAY("Juma kunu event "),
    SATURDAY("Ishembi kunu koshumcha sabak "),
    SUNDAY("Jekshembi kunu es alam")
    ;
    private String value;

    Days(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
