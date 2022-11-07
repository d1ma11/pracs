package prac12;

public class FileName {
    private String fullPath;
    private char pathSeparator, extensionSeparator;

    public FileName(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    public String fileName() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
}

class Main {
    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        FileName myHomePage = new FileName(FPATH, '/','.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.fileName());
        System.out.println("Path = " + myHomePage.path());
    }
}
