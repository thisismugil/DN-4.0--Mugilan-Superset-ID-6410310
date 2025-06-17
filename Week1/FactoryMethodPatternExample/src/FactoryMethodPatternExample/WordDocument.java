package FactoryMethodPatternExample;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word");
    }
    @Override
    public void save() {
        System.out.println("Saving Word");
    }
    @Override
    public void close() {
        System.out.println("Closing Word");
    }
}