package com.example.backendtodo.service;

import com.example.backendtodo.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
