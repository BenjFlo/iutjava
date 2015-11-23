package edu.iut.filtre;

import java.util.List;

import edu.iut.app.ExamEvent;

public interface Filtre {
   public List<ExamEvent> meetExamEvent(List<ExamEvent> filtre);
}