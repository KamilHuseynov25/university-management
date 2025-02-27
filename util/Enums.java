package util;

public class Enums {
    public enum StudentDegree {
        BACHELORS,
        MASTERS,
        PHD
    }

    public enum SchoolType {
        COLLEGE,
        PUBLIC_AND_INTERNATIONAL_AFFAIRS,
        BUSINESS,
        IT_AND_ENGINEERING,
        EDUCATION,
        LAW,
        AGRICULTURAL_AND_FOOD_SCIENCES,
        DESIGN_AND_ARCHITECTURE,
    }

    public enum FacultyType {
        INSTRUCTOR,
        SENIOR_INSTRUCTOR,
        ASSISTANT_PROFESSOR,
        ASSOCIATE_PROFESSOR,
        PROFESSOR_IN_PRACTICE,
        FULL_PROFESSOR,
    }

    public enum Equipment{
        NONE,
        SMART_BOARD,
        WHITEBOARD,
        COMPUTERS,
        PROJECTOR
    };

    public enum RoomType{
        NONE,
        OFFICE,
        MAJLIS,
        G_STUDY,
        S_CASES,
        M_CASES,
        L_CASES,
        AUDITORIUM,
        LAB
    };
    public enum DepartmentType {
    HUMAN_RESOURCES("Human Resources"),
    FINANCE("Finance"),
    IT("Information Technology"),
    MARKETING("Marketing"),
    ENGINEERING("Engineering"),
    STUDENT_ADMINISTRATION("Administration"),
    LEGAL("Legal");

    private final String displayName;

    DepartmentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

public enum BuildingNames{
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    L("L");

    private final String displayName;

    BuildingNames(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
}
