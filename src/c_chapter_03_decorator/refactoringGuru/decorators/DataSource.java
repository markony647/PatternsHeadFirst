package c_chapter_03_decorator.refactoringGuru.decorators;


public interface DataSource {

    void writeData(String data);

    String readData();
}
