package note.service;

import note.model.Note;
import note.repository.NoteRepo;

import java.util.List;

public class NoteService {
    private NoteRepo repo;

    public NoteService(NoteRepo repo) {
        this.repo = repo;
    }

    public  void create(String text) {
        int id = repo.getId();
        Note note = new Note(id, text);
        repo.add(note);
    }

    public void showAll() {
        List<Note> allNotes = repo.getAll();
        for (Note note : allNotes) {
            System.out.println(String.format("Id: %d Text: %s",
                    note.getId(), note.getText()));
        }
    }
}
