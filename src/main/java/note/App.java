package note;

import note.repository.NoteRepo;
import note.repository.NoteRepoList;
import note.service.ConsoleService;
import note.service.NoteService;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        NoteRepo repo = new NoteRepoList();
        NoteService noteService = new NoteService(repo);
        ConsoleService consoleService = new ConsoleService();

        while (true) {
            String answer = consoleService.askQuestion("make choice \n1 to create new note\n2 to show all notes");
            if (answer.equals("1")) {
                String text = consoleService.askQuestion("enter your text", true);
                noteService.create(text);
            } else if (answer.equals("2")) {
                System.out.println("showing ...");
                noteService.showAll();
            } else {
                System.out.println(" i dont know");
                break;
            }
        }
    }
}
