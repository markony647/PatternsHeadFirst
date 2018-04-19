package c_chapter_03_decorator.decorators;


import c_chapter_03_decorator.components.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
