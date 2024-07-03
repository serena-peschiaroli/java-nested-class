package web.codecademy.nestedclass;

class ShopItems {
    int totalCount;

    class NonVegan {
        public int iceCreamCount;
        public int shakeCount;
        public int totalCount;

        public void increaseCount(int type, int count) {
            if (type == 1) {
                iceCreamCount += count;
            } else if (type == 2) {
                shakeCount += count;
            }
            this.totalCount += count;
            ShopItems.this.totalCount += count;
        }
    }

    class Vegan {
        public int smoothieCount;
        public int slushieCount;
        public int totalCount;

        public void increaseCount(int type, int count) {
            if (type == 3) {
                smoothieCount += count;
            } else if (type == 4) {
                slushieCount += count;
            }
            this.totalCount += count;
            ShopItems.this.totalCount += count;
        }
    }
}

