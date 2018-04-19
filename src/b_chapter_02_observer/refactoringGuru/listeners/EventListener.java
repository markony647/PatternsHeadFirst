package b_chapter_02_observer.refactoringGuru.listeners;

import java.io.File;

public interface EventListener {

    public void update(String eventType, File file);
}
