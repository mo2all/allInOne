package designPattern.chapter10;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
