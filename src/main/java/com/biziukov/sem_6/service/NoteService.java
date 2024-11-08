package com.biziukov.sem_6.service;

import com.biziukov.sem_6.domain.Note;

import java.util.List;

public interface NoteService {
    Note createNote(Note note);

    List<Note> getAllNotes();

    Note getNoteById(Long id);

    Note updateNote(Note note);

    void deleteNote(Long id);
}