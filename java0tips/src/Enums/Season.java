package Enums;

public enum Season {
        WINTER(21),
        SPRING(22),
        SUMMER(23),
        FALL(24);

        private int value;
        private Season(int val) {
            value = val;
        }

        public int getValue() {
            return value;
        }
}

