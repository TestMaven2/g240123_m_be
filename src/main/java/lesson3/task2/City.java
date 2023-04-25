package lesson3.task2;

public enum City {

    BERLIN("Берлин", 3_000_000) {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    PARIS("Париж", 3_500_000) {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    LONDON("Лондон", 9_000_000) {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    RIGA("Рига", 600_000) {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    MADRID("Мадрид", 2_500_000) {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    ROME("Рим", 2_800_000) {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    LISBON("Лиссабон", 500_000) {
        @Override
        public boolean isPopular() {
            return false;
        }
    };

//    City() {
//        System.out.println("Вызван конструктор City");
//    }

    private String rusName;
    private int population;
    private int i;

    City(String rusName, int population) {
        System.out.println("Вызван конструктор City с параметром " + rusName);
        this.rusName = rusName;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Город: " + name() + ", Русское название: " + rusName + ", Население: " + population;
    }

    public String toString(boolean isNeedRussianName) {
        if (isNeedRussianName) {
            return "Город: " + name() + ", Русское название: " + rusName + ", Население: " + population;
        } else {
            return "Город: " + name() + ", Население: " + population;
        }
    }

    public abstract boolean isPopular();
}