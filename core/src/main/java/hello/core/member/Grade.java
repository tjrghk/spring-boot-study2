package hello.core.member;


public enum Grade {
    BASIC,
    VIP;

    // private final String value;

    // private Grade(String value) {
    //     this.value = value;
    // }

    // public String getValue() {
    //     return this.value;
    // }

    // public static Grade of(String value)  {
    //     return Arrays.stream(values())
    //         .filter(v -> value.equals(v.value))
    //         .findAny()
    //         .orElseThrow(() -> new IllegalArgumentException());
    // }
}
