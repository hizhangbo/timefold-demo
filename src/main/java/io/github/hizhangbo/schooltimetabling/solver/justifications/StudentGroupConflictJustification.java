package io.github.hizhangbo.schooltimetabling.solver.justifications;

import ai.timefold.solver.core.api.score.stream.ConstraintJustification;
import io.github.hizhangbo.schooltimetabling.domain.Lesson;

public record StudentGroupConflictJustification(String studentGroup, Lesson lesson1, Lesson lesson2, String description)
        implements
        ConstraintJustification {
    public StudentGroupConflictJustification(String studentGroup, Lesson lesson1, Lesson lesson2) {
        this(studentGroup, lesson1, lesson2,
                "Student group '%s' has lesson '%s' and lesson '%s' at '%s %s'"
                        .formatted(studentGroup, lesson1.getSubject(), lesson2.getSubject(),
                                lesson1.getTimeslot().getDayOfWeek(), lesson1.getTimeslot().getStartTime()));
    }
}
