package hu.ibello.ui.model;

public enum Languages {

    ENGLISH,
    HUNGARIAN;

    @Override
    public String toString() {
        switch (this) {
            case ENGLISH:
                return "english";
            case HUNGARIAN:
                return "hungarian";
        }
        return "";
    }
}
