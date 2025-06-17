package FactoryMethodPatternExample;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel");
    }
    @Override
    public void save() {
        System.out.println("Saving Excel");
    }
    @Override
    public void close() {
        System.out.println("Closing Excel");
    }
}