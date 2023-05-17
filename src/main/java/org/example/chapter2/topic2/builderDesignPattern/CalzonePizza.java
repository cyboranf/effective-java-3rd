package org.example.chapter2.topic2.builderDesignPattern;

public class CalzonePizza extends Pizza {
    CalzonePizza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public CalzonePizza build() {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public static void main(String[] args) {
        CalzonePizza pizza=new CalzonePizza.Builder()
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.HAM)
                .sauceInside()
                .build();
        System.out.println(pizza.toppings);
        System.out.println(pizza.sauceInside);
    }
}
