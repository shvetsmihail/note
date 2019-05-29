package note.repository;

import note.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteRepoList implements NoteRepo {

    private List<Note> repo;

    public NoteRepoList() {
        repo = new ArrayList<Note>();
    }

    public void add(Note note) {
        repo.add(note);
    }

    public List<Note> getAll() {
        return repo;
    }

    public Note getById(int id) {
        return null;
    }

    public void update(int id) {

    }

    public void delete(int id) {

    }

    public int getId() {
        return repo.size() + 1;
    }
}
