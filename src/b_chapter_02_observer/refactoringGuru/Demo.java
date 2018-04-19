//package b_chapter_02_observer.refactoringGuru;
//
//import b_chapter_02_observer.refactoringGuru.editor.Editor;
//import b_chapter_02_observer.refactoringGuru.listeners.EmailNotificationListener;
//import b_chapter_02_observer.refactoringGuru.listeners.LogOpenListener;
//
//public class Demo {
//
//    Editor editor = new Editor();
//        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
//        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
//
//        try {
//        editor.openFile("test.txt");
//        editor.saveFile();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
