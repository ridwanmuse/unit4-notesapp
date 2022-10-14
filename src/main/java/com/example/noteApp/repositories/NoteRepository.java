package com.example.noteApp.repositories;

import com.example.noteApp.entites.Note;
import com.example.noteApp.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
