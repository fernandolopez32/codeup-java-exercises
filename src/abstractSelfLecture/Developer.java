package abstractSelfLecture;

class Developer implements WritesCode {

    @Override
    public Bug[] writeCode(int numberOfLines) {
        return new Bug[numberOfLines];
    }

    @Override
    public boolean debug(Bug bug) {
        return false;
    }

//    @Override
//    public StackOverflowLink searchForAnswer(Bug bug) {
//        return null;
//    }
//
//    @Override
//    public BrokenKeyboard smashKeyboard(Keyboard k) {
//        return null;
//    }

    @Override
    public void drinkCoffee() {
        System.out.println("Coffee, nah i need a RedBull");
    }

}

