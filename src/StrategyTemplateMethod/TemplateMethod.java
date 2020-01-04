package StrategyTemplateMethod;

public abstract class TemplateMethod implements Strategy
{
    @Override
    public void sort()
    {
        start();
        stop();
    }

    protected abstract void start();
    protected abstract void stop();
}
