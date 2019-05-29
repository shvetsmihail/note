package note.repository;

import note.model.Note;

import java.util.List;

public interface NoteRepo {
    void add(Note note);

    List<Note> getAll();

    Note getById(int id);

    void update(int id);

    void delete(int id);

    int getId();
}
